
//---------------------------------------
// clase Automata
//---------------------------------------
public class Automata
{
    String _textoIma;
    int _edoAct;
    private char SigCar(int i)
    {
        if (i == _textoIma.length())
            return 'ı';
        else
            return _textoIma.charAt(i);
    }
    
    public Boolean Reconoce(String texto,Lexico oAnaLex,int noAuto)
    {
        char c;
        _textoIma = texto;
        String lenguaje;
        
        switch (noAuto)
        {
        //-------------- Automata delim--------------
            case 0 : _edoAct = 0;
                    break;
        //-------------- Automata Id--------------
            case 1 : _edoAct = 3;
                    break;
        //-------------- Automata OpAsig--------------
            case 2 : _edoAct = 6;
                    break;
        //-------------- Automata oparit--------------
            case 3 : _edoAct = 11;
                    break;
        //-------------- Automata num--------------
            case 4 : _edoAct = 13;
                    break;
        //-------------- Automata sep--------------
            case 5 : _edoAct = 18;
                    break;
        //-------------- Automata termInst--------------
            case 6 : _edoAct = 20;
                    break;
        //-------------- Automata OperLogic-------------
            case 7 : _edoAct = 22;
                    break;
        //-------------- Automata OperRela--------------                    
            case 8 : _edoAct = 26;
                    break;
        //------------------- OperRela -----------------            
            case 9 : _edoAct = 29;
                    break;
        //------------------- Punto -----------------            
            case 10 : _edoAct = 31;
                    break;
        //------------------- Coma -----------------            
            case 11 : _edoAct = 33;
                    break;
        //------------------- Cadena -----------------            
            case 12 : _edoAct = 35;
                    break; 
        //------------------- SigIgual = -----------------            
            case 13 : _edoAct = 38;
                    break;
        //------------------- Sig = -----------------            
            case 14 : _edoAct = 40;
                    break;
        }
        
        while(oAnaLex.getI()<=_textoIma.length())
        switch (_edoAct)
        {
        //-------------- Automata delim--------------
            case 0 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=" \n\r\t").indexOf(c)>=0) 
                        _edoAct=1; 
                    else
                    { 
                           oAnaLex.setI(oAnaLex.getIniToken());
                           return false; 
                    }
                    break;
                    
            case 1 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=" \n\r\t").indexOf(c)>=0) 
                        _edoAct=1; 
                    else
                        if ((lenguaje="!\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ı€ı‚ƒ„…†‡ˆ‰Š‹OEıŽıı‘’“”•–—˜™š›oeıžŸ ¡¢£¤¥¦§¨©ª«¬-®¯°±²³´μ¶·¸¹º»¼½¾¿\f").indexOf(c)>=0) 
                            _edoAct=2; 
                        else
                        { 
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false; 
                        }
                    break;
                    
            case 2 : oAnaLex.setI(oAnaLex.getI()-1);
                    return true;
                    
            //-------------- Automata Id--------------
            case 3 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz").indexOf(c)>=0) 
                        _edoAct=4; 
                    else
                        if ((lenguaje="_").indexOf(c)>=0) 
                            _edoAct=4; 
                        else
                        { oAnaLex.setI(oAnaLex.getIniToken());
                            return false; 
                        }
                    break;
                    
            case 4 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz").indexOf(c)>=0) 
                        _edoAct=4; 
                    else
                        if ((lenguaje="_").indexOf(c)>=0) 
                            _edoAct=4; 
                        else
                            if ((lenguaje="0123456789").indexOf(c)>=0) 
                                _edoAct=4; 
                            else
                                if ((lenguaje=" !\"#$%&\'()*+,-./:;<=>?@[\\]^`{|}~ı€ı‚ƒ„…†‡ˆ‰Š‹OEıŽıı‘’“”•–—˜™š›oeıžŸ ¡¢£¤¥¦§¨©ª«¬-®¯°±²³´μ¶·¸¹º»¼½¾¿\n\t\r\f").indexOf(c)>=0) 
                                    _edoAct=5; 
                                else
                                { 
                                    oAnaLex.setI(oAnaLex.getIniToken());
                                    return false; 
                                }
                    break;
            case 5 : oAnaLex.setI(oAnaLex.getI()-1);
                    return true;
                    
            //-------------- Automata OpAsig--------------
            case 6 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="=").indexOf(c)>=0) 
                        _edoAct=38; 
                    else
                        if ((lenguaje="+").indexOf(c)>=0) 
                            _edoAct=9; 
                        else
                            if ((lenguaje="-").indexOf(c)>=0) 
                                _edoAct=10; 
                            else
                                if ((lenguaje="*").indexOf(c)>=0) 
                                    _edoAct=8; 
                                else
                                    if ((lenguaje="/").indexOf(c)>=0) 
                                        _edoAct=8; 
                                    else
                                    { 
                                        oAnaLex.setI(oAnaLex.getIniToken());
                                        return false; 
                                    }
                break;
                
            case 7 : return true;
            
            case 8 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="=").indexOf(c)>=0) 
                        _edoAct=7; 
                    else
                    { 
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false; 
                    }
                break;
                
            case 9: c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="+").indexOf(c)>=0) 
                        _edoAct=7; 
                    else
                    { 
                        if ((lenguaje="=").indexOf(c)>=0)
                            _edoAct=7;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false;
                        } 
                    }
                break;
                
            case 10: c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="-").indexOf(c)>=0) 
                        _edoAct=7; 
                    else
                    { 
                        if ((lenguaje="=").indexOf(c)>=0)
                            _edoAct=7;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false;
                        }  
                    }
                break;
                
        //-------------- Automata oparit--------------
            case 11 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="+").indexOf(c)>=0) 
                        _edoAct=12; 
                    else
                        if ((lenguaje="-").indexOf(c)>=0) 
                            _edoAct=12; 
                        else
                            if ((lenguaje="*").indexOf(c)>=0) 
                                _edoAct=12; 
                            else
                                if ((lenguaje="/").indexOf(c)>=0) 
                                    _edoAct=12; 
                                else
                                { 
                                    if ((lenguaje="%").indexOf(c)>=0) 
                                        _edoAct=12;
                                    else
                                    {
                                        oAnaLex.setI(oAnaLex.getIniToken());
                                        return false;
                                    }
                                }
                break;
                
            case 12 : return true;
            
        //-------------- Automata num--------------
            case 13 : c=SigCar(oAnaLex.getI());
                      oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje="0123456789").indexOf(c)>=0) 
                            _edoAct=14; 
                        else
                            { 
                                oAnaLex.setI(oAnaLex.getIniToken());
                                return false; 
                            }
                break;
                
            case 14 : c=SigCar(oAnaLex.getI());
                        oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje="0123456789").indexOf(c)>=0) 
                            _edoAct=14; 
                        else
                            if ((lenguaje=" !\"#$%&\'()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ı€ı‚ƒ„…†‡ˆ‰Š‹OEıŽıı‘’“”•–—˜™š›oeıžŸ ¡¢£¤¥¦§¨©ª«¬-®¯°±²³´μ¶·¸¹º»¼½¾¿\n\t\r\f").indexOf(c)>=0) 
                                _edoAct=15; 
                            else
                                if ((lenguaje=".").indexOf(c)>=0) 
                                    _edoAct=16; 
                                else
                                { 
                                    oAnaLex.setI(oAnaLex.getIniToken());
                                    return false; 
                                }
                break;
                
            case 15 : oAnaLex.setI(oAnaLex.getI()-1);
                        return true;
                        
            case 16 : c=SigCar(oAnaLex.getI());
                        oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje="0123456789").indexOf(c)>=0) 
                            _edoAct=17; 
                        else
                        { 
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false; 
                        }
                break;
                
            case 17 : c=SigCar(oAnaLex.getI());
                        oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje="0123456789").indexOf(c)>=0) 
                            _edoAct=17; 
                        else
                            if ((lenguaje=" !\"#$%&\'()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ı€ı‚ƒ„…†‡ˆ‰Š‹OEıŽıı‘’“”•–—˜™š›oeıžŸ ¡¢£¤¥¦§¨©ª«¬-®¯°±²³´μ¶·¸¹º»¼½¾¿\n\t\r\f").indexOf(c)>=0) 
                                _edoAct=15; 
                            else
                                if ((lenguaje=".").indexOf(c)>=0) 
                                    _edoAct=15; 
                                else
                                { 
                                    oAnaLex.setI(oAnaLex.getIniToken());
                                    return false; 
                                }
                break;
                
        //-------------- Automata sep--------------
            case 18 : c=SigCar(oAnaLex.getI());
                        oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje="(").indexOf(c)>=0 || (lenguaje="{").indexOf(c)>=0 || (lenguaje="[").indexOf(c)>=0) 
                            _edoAct=19; 
                        else
                            if ((lenguaje=")").indexOf(c)>=0 || (lenguaje="}").indexOf(c)>=0 || (lenguaje="]").indexOf(c)>=0) 
                                _edoAct=19; 
                            else
                            { 
                                oAnaLex.setI(oAnaLex.getIniToken());
                                return false; 
                            }
                break;
            case 19 : return true;
        //-------------- Automata termInst--------------
            case 20 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                        if ((lenguaje=";").indexOf(c)>=0) 
                            _edoAct=21; 
                        else
                        { 
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false; 
                        }
                break;
            case 21 : return true;
            
            //-------------- Automata OperLogic--------------
            case 22 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="!").indexOf(c)>=0) 
                        _edoAct=23; 
                    else
                        if ((lenguaje="|").indexOf(c)>=0) 
                            _edoAct=24; 
                        else
                            if ((lenguaje="^").indexOf(c)>=0) 
                                _edoAct=23; 
                            else
                                if ((lenguaje="&").indexOf(c)>=0) 
                                    _edoAct=24; 
                                else
                                { 
                                    oAnaLex.setI(oAnaLex.getIniToken());
                                    return false; 
                                }
                break;
            case 23 : return true;
            
            case 24 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="|").indexOf(c)>=0) 
                        _edoAct=23; 
                    else
                    { 
                        if((lenguaje="&").indexOf(c)>=0)
                        {
                            _edoAct=23;
                        }
                        else
                        {
                            if ((lenguaje=" !\"#$%&\'()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ı€ı‚ƒ„…†‡ˆ‰Š‹OEıŽıı‘’“”•–—˜™š›oeıžŸ ¡¢£¤¥¦§¨©ª«¬-®¯°±²³´μ¶·¸¹º»¼½¾¿\n\t\r\f").indexOf(c)>=0) 
                                _edoAct=25;
                            else
                            {
                                oAnaLex.setI(oAnaLex.getIniToken());
                                return false;
                            }
                        }
                    }
                break;
                
                case 25 : oAnaLex.setI(oAnaLex.getI()-1);
                        return true;
                
                //-----------Automata OperRela---------------------        
                case 26 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="<").indexOf(c)>=0) 
                        _edoAct=27; 
                    else
                        if ((lenguaje=">").indexOf(c)>=0) 
                            _edoAct=27;
                        else
                            if ((lenguaje="!").indexOf(c)>=0) 
                                _edoAct=27;
                            else
                            {
                                oAnaLex.setI(oAnaLex.getIniToken());
                                return false;
                            }
                    break;
                    
                case 27 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="=").indexOf(c)>=0) 
                        _edoAct=28; 
                    else
                    {
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false;
                    }
                    break;
                            
                case 28 : return true;
                //---------- OperRela ----------------------------------
                case 29 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="<").indexOf(c)>=0) 
                        _edoAct=30; 
                    else
                        if ((lenguaje=">").indexOf(c)>=0) 
                            _edoAct=30;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false;
                        }
                    break;
                    
                case 30 : return true; 
                //----------- Punto ------------------------------------
                case 31 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=".").indexOf(c)>=0) 
                        _edoAct=32; 
                    else
                    {
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false;
                    }
                    break;
                    
                case 32 : return true; 
                //----------- Coma -------------------------------------
                case 33 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=",").indexOf(c)>=0) 
                        _edoAct=34; 
                    else
                    {
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false;
                    }
                    break;
                case 34 : return true;
                //----------- Cadena -----------------------------------
                case 35 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="\"").indexOf(c)>=0) 
                        _edoAct=36; 
                    else
                    {
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false;
                    }
                    break;
                case 36 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=" !#$%&()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}¿\n\t\r\f").indexOf(c)>=0)  
                        _edoAct=36; 
                    else
                        if ((lenguaje="\"").indexOf(c)>=0)
                            _edoAct=37;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false;
                        }
                    break;
                    
                case 37 : return true; 
                
                //---------------- Sig = --------------------------------------
                case 38 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="=").indexOf(c)>=0)
                    {
                        System.out.println("salida =");
                        _edoAct=7; 
                    }
                    else
                    {
                        /*if ((lenguaje=" !#$%&()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}¿").indexOf(c)>=0)
                            _edoAct=39;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            System.out.println("entro en nada");
                            return false;
                        }*/
                        _edoAct = 39;
                    }                    
                    break;
                
                case 39 : oAnaLex.setI(oAnaLex.getI()-1);
                        return true;
                        
                //----------- Caracter -----------------------------------
                case 40 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje="'").indexOf(c)>=0) 
                        _edoAct=41; 
                    else
                    {
                        oAnaLex.setI(oAnaLex.getIniToken());
                        return false;
                    }
                    break;
                case 41 : c=SigCar(oAnaLex.getI());
                    oAnaLex.setI(oAnaLex.getI()+1);
                    if ((lenguaje=" !#$%&()*+,-/:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}¿").indexOf(c)>=0)  
                        _edoAct=41; 
                    else
                        if ((lenguaje="'").indexOf(c)>=0)
                            _edoAct=42;
                        else
                        {
                            oAnaLex.setI(oAnaLex.getIniToken());
                            return false;
                        }
                    break;
                    
                case 42 : return true; 
        }   
        
            switch (_edoAct)
            {
                case 2 : // Autómata delim
                case 5 : // Autómata Id
                case 15 : // Autómata num
                case 25 : //Automata
                case 39 : //----------
                   oAnaLex.setI(oAnaLex.getI()-1);
                return true;
            }
            
        return false;
    }
} // fin de la clase Automata
