/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTM
 */
//---------------------------------------
// clase Lexico
//---------------------------------------
public class Lexico
{
    final int TOKREC = 16;
    final int MAXTOKENS = 500;
    private String[] _lexemas;
    private String[] _tokens;
    public String palabras_reservadas []={"abstract ","assert","boolean","break","byte","case","catch","char","class","const",
					 "continue","default","do","double","else","enum","extends","final","finally","float",
					 "for","goto","if","implements","import","instanceof","int","interface","long","native",
					  "new","package","private","protected","public","return","short","static","strictfp",
					  "super","switch","synchronized","String","this","throw","throws","transient","try","void","volatile","while",
					  "System","out","print","println","printf","java","main","args","Array[]"};
    private String _lexema;
    private int _noTokens;
    private int _i;
    private int _iniToken;
    private Automata oAFD;
    
    //Kevdey agrego esto:
    private String[]_ides;
    private int indiceID;
    private String[] numlin;
    private int indinumlin;
    private int contnumlin;
    
    //Nueva Actualizacion
    private String[] iDAux;
    private int inDaux;
    private String[] iDep;
    private int inDep;
    
    private String[] tokensDep = new String[MAXTOKENS];
    private String[] numlDep = new String[MAXTOKENS];
    private String[] lexDep  = new String[MAXTOKENS];
    
    //El Neko----------
    private int NumLin;
    private String[] NumLinea;    
    
    public Lexico() // constructor por defecto
    {
        _lexemas = new String[MAXTOKENS];
        _tokens = new String[MAXTOKENS];
        oAFD = new Automata();
        _i = 0;
        _iniToken = 0;
        _noTokens = 0;
        
        //Kevdey agrego esto:
        _ides = new String[MAXTOKENS];
        indiceID=0;
        numlin=new String[MAXTOKENS];
        indinumlin=0;
        contnumlin=1;
        
        //Nueva Actualizacion
        iDAux= new String[MAXTOKENS];
        inDaux=0;
        iDep = new String[MAXTOKENS];
        inDep=0;
        tokensDep = new String[MAXTOKENS];
        numlDep = new String[MAXTOKENS];
        lexDep  = new String[MAXTOKENS];
        
        //El Neko -----------------------
        NumLin = 1;
        NumLinea = new String[MAXTOKENS];
    }
    
    public void Inicia()
    {
        _i = 0;
        _iniToken = 0;
        _noTokens = 0;
        _lexemas = new String[MAXTOKENS];
        _tokens = new String[MAXTOKENS];
        
        //Kevdey agrego esto:
        _ides = new String[MAXTOKENS];
        indiceID=0;
        numlin=new String[MAXTOKENS];
        indinumlin=0;
        contnumlin=1;
        
        //Nueva Actualizacion
        iDAux= new String[MAXTOKENS];
        inDaux=0;
        iDep = new String[MAXTOKENS];
        inDep=0;
        
        tokensDep = new String[MAXTOKENS];
        numlDep = new String[MAXTOKENS];
        lexDep  = new String[MAXTOKENS];
        
        //El Neko -----------------------
        NumLin = 1;
        NumLinea = new String[MAXTOKENS];
    }
    public void Analiza(String texto)
    {
        Boolean recAuto;
        int noAuto;
        
        String sad=""; 
        sad = Sincomentario(texto);
        texto=sad;
        System.out.println("SinCom: "+sad);
        System.out.println("texto tamaño: "+texto.length());
        while (_i < texto.length())
        {
            recAuto=false;
            noAuto=0;
            for(;noAuto<TOKREC&&!recAuto;)
                if(oAFD.Reconoce(texto,this,noAuto))
                    recAuto=true;
                else
                {                    
                    noAuto++;
                }                    
            if (recAuto)
            {
                _lexema = texto.substring(_iniToken, _i);
                System.out.println("lexema: "+_lexema);
                
                for(int i=0;i < palabras_reservadas.length;i++)
                {
                    if(_lexema.equals(palabras_reservadas[i]))
                    {
                        noAuto=15;
                    }
                }
                    switch (noAuto)
                    {
                    //-------------- Automata delim--------------
                        case 0 : _tokens[_noTokens] = " ";
                                if(_lexema.contains("\n"))
                                {
                                    ++contnumlin;
                                    ++NumLin;
                                }
                                break;
                    //-------------- Automata Id--------------
                        case 1 : _tokens[_noTokens] = "id"+"."+_lexema;
                                //Kevdey agrego esto
                                _ides[indiceID]=_lexema;
                                numlin[indinumlin]=Integer.toString(contnumlin);
                                ++indinumlin;
                                ++indiceID;
                                NumLinea[_noTokens] = Integer.toString(NumLin); 
                                break;

                                
                    //-------------- Automata OpAsig--------------
                        case 2 : //_tokens[_noTokens] = "OpAsig";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata oparit--------------
                        case 3 : //_tokens[_noTokens] = "oparit";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata num--------------
                        case 4 : _tokens[_noTokens] = "num"+"."+_lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata sep--------------
                        case 5 : //_tokens[_noTokens] = "sep";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata termInst--------------
                        case 6 : //_tokens[_noTokens] = "termInst";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata OperLogic-------------
                        case 7 : //_tokens[_noTokens] = "OperLogic";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata OperRela -------------            
                        case 8 : //_tokens[_noTokens] = "OperRela";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                        case 9 : //_tokens[_noTokens] = "OperRela";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Punto -------------            
                        case 10 : //_tokens[_noTokens] = "Punto";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Coma -------------            
                        case 11 : //_tokens[_noTokens] = "Coma";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Cadena -------------            
                        case 12 : _tokens[_noTokens] = "Cadena";
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Comentario -------------            
                        case 13 : //_tokens[_noTokens] = "SigIgual";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Comentario -------------            
                        case 14 : _tokens[_noTokens] = "Caracter";
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    //-------------- Automata Caracter -------------            
                        case 15 : //_tokens[_noTokens] = "Reservada";
                                _tokens[_noTokens] = _lexema;
                                NumLinea[_noTokens] = Integer.toString(NumLin);
                                break;
                    }
                    _lexemas[_noTokens++] = _lexema;
            }
            else
            {                
                _i++;
            }
            _iniToken = _i;
          
        }
        //Nueva Actualizacion
        iDAux=_ides;
        int i1,j1,k1,nx=0, contapr=0, contep=0;
        for(i1=0;iDAux[i1]!=null;i1++){
            ++contapr;
            //System.out.println(contapr);
        }
        for(i1=0;i1<contapr;i1++){
            j1=i1+1;
            for(k1=j1;k1<contapr;k1++){
                if(iDAux[i1].equals(iDAux[k1])){
                    iDAux[k1]="@XNaNx";
                } 
            }
        }
        for(i1=0;i1<contapr;i1++){
            if(!iDAux[i1].equals("@XNaNx")){
                iDep[inDep]=iDAux[i1];
                ++inDep;
            }
        }
        
        
        for(int z=0;_tokens[z]!=null; z++){
            ++nx;
        }
        for(int z=0;z<nx;z++){
            if(NumLinea[z]==null){
                NumLinea[z]="@Xa";
            }
        }
        for(int z=0;z<nx; z++){
            if(!NumLinea[z].equals("@Xa")){
                tokensDep[contep] = _tokens[z];
                numlDep[contep] = NumLinea[z];
                lexDep[contep]  = _lexemas[z];
                ++contep;
            }
        }
        
    } // fin del método Analiza()       
    
    public String Sincomentario(String A){
        int i,Actual,ant,bandera;
        String Cadena;
        i=0;
        bandera = Actual = ant = i;
        StringBuffer Acopy = new StringBuffer("") ;//Para cambiar al tipo de archivo 
        int i2 = 0;
       
        while(i2 < A.length()){
            Acopy.append(A.charAt(i2));
            i2 = i2 + 1;
        }
        System.out.println(Acopy);
        
        
        /*Borrado de comentarios*/
        while(i < Acopy.length()){
            if(Acopy.charAt(i) != '/'){
                i = i + 1;
            }
            else{
                if(Acopy.charAt(i + 1) != '/'){
                    if(Acopy.charAt(i + 1) != '*'){
                        i = i + 2;
                    }
                    else{
                        ant = i;
                        i = i + 2; 
                        while(bandera!=1){
                            if (Acopy.charAt(i) != '*' ){
                                if (Acopy.charAt(i) == '\n'){
                                    Actual = i;
                                    while(ant != Actual){
                                        Acopy.setCharAt(ant,' ');
                                        ant = ant + 1;
                                    }
                                    ant = ant + 1;
                                }
                                i = i + 1;
                            }
                            else{
                                if(Acopy.charAt(i+1) != '/'){
                                    i = i + 1;
                                }
                                else {
                                    Actual = i + 2;
                                    i = i + 2;
                                    
                                    while(ant != Actual){
                                        Acopy.setCharAt(ant,' ');
                                        ant = ant + 1;
                                    }
                                    bandera = 1;
                                }
                            }
                            
                            
                        }
                        bandera = 0;
                    }
                }
                else{
                    ant = i;
                    i = i + 2;
                    while(bandera!=1){
                        if (Acopy.charAt(i)!= '\n'){
                            i = i + 1;
                        }
                        else{
                            Actual = i;
                            i = i + 1;
                            while(ant != Actual){
                                Acopy.setCharAt(ant,' ');
                                ant = ant + 1;
                            }
                            bandera = 1;
                        }
                    }
                    bandera = 0;
                }
            }
        }
        Cadena = Acopy.toString();
        //return Acopy;
        return Cadena;
    }
    //Nueva Actualizacion
    public void DepuraSimbolos(){
        iDAux=_ides;
	int i, j, k, n=0;
	for (i=0;i<iDAux.length; i++) {
		j=i+1;
		for (k=j;k < iDAux.length; k++) {
			if (iDAux[i].equals(iDAux[k])) {
				iDAux[k]="XNaNx";
			}
		}
			
	}
        
       	for (i=0;i<iDAux.length; i++) {
		if (!iDAux[i].equals("XNaNx")) {
			iDep[n]=iDAux[i];
			++n;
		}
	} 
        
    }
    
    public int getI()
    {
        return _i;
    }
    public void setI(int valor)
    {
        _i=valor;
    }
    public int getIniToken()
    {
        return _iniToken;
    }
    public String[] Tokens()
    {
        return _tokens;
    }
    public String[] Lexemas()
    {
        return _lexemas;
    }
    public String[] Identificadores()
    {
        return _ides;
    }
    //Nueva Actualizacion
    public String[] IdentificadoresDEP()
    {
        return iDep;
    }
    public String[] NumerosLinea(){
        return numlin;
    }
    public String[] NumLinea(){
        return NumLinea;
    }
    //Nueva Actualizacion
    public String[] NumLineaDEP(){
        return numlDep;
    }
    public String[] TokensDEP()
    {
        return tokensDep;
    }
    public String[] LexemasDEP()
    {
        return lexDep;
    }
} // fin de la clase Lexico
//----------------------------
