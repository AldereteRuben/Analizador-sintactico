/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

//import com.sun.xml.internal.messaging.saaj.util.CharReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

//import static sun.misc.Version.println;

/**
 * @author Sourabh
 */
public class LexicalAnalyser {

    /**
     * @param args the command line arguments
     */
    public static FileReader f1;
    public static String Datos_TKNS[][]={};
    public static String Datos_TKNS_[][]={};
    public static String Datos_L_S[][]={};
    public static String Datos_L_S_[][]={};
    public static String Tira_Token="";
    
    public static LinkedList<String> Simbolos = new LinkedList<String>();
    public static LinkedList<String> LiErrores = new LinkedList<String>();    
    
    public static LinkedList<String> Pila = new LinkedList<String>();
    
    public static LinkedList<String> Valores = new LinkedList<String>();

    public LexicalAnalyser(String In_Entrada) throws IOException{
        // TODO code application logic here
        int i = 0, c;
        Scanner in = new Scanner(System.in);
        f1 = new FileReader(In_Entrada);        
        FileWriter f2 = new FileWriter("output.txt");
        StringBuilder sb = new StringBuilder();        
        Keyword keyword = new Keyword();
        Punctuator punctuator = new Punctuator();
        int rflag = 1;
        char o=' ';
        char Ta=' ';
        Datos_TKNS = new String[900][3];
        Datos_L_S = new String[150][2];
        String numeros = "0123456789";
        String otros = ":";
        int isComment=0;
        int contador=0;
        int con_Lin=0;
        int cont=1;
        int warning=0;
        int Errores[]={64,35,168,36,63,94,96,126};
        int L_S=0;
        int E_Con=-1;
        String help="";
        
        while (true) {
            //System.out.println("------------------------------------------------------------------INICIO::::::::::::::");
            Datos_TKNS[contador][2]=cont+"";
            if (rflag == 1)
            {
                c = readChar();
                System.out.println("Codigo::::::::::::::"+c);
                if(c==13 || c==47){
                    cont++;
                    Datos_TKNS[contador][2]=cont+"";
                }
                if (c == -1)
                    break;
                else if (c == 1000) 
                {
                    System.out.println("I/O exception caught while reading file provide proper typr of file");
                } else 
                {
                    Ta = (char)c;
                    for(int c_E=0;c_E<Errores.length;c_E++)
                    {
                        if(Ta == Errores[c_E])
                        {
                            warning=1;
                        }
                    }
                    if(warning == 1)
                    { 
                        Simbolos.add((Ta+""));
                        LiErrores.add((cont+""));
                        warning = 0;
                    }
                    else
                    {
                        o = (char) c;
                        System.out.println("Codigo para el valor ooooo::::::::::::::"+o);
                    }
                }

            }            
            int pb = punctuator.isPunctuator(o);
            System.out.println("Sigue::::::::::::::"+"----"+pb);
            if (pb == 100)
            {
                System.out.println("Sigue en PB::::::::::::::");
                sb.append(o);
                rflag=1;
            } 
            else 
            {
                System.out.println("Entro en else::::::::::::::");
                if (sb.toString().isEmpty() || sb.toString().equals("\n"))
                {
                    if((pb>=0 && pb<=4) || o=='|' || o=='!')
                    {
                        int temp = readChar();
                        char tempO= (char) temp;
                        int tempPb= punctuator.isPunctuator(tempO);
                        int f=0;
                        switch(o)
                        {
                            case '+':
                                if(tempO == o) // ++
                                    f=1;
                                if(tempO =='=')
                                {
                                    f=1;
                                }
                                break;
                            case '-':
                                if(tempO == o) // --
                                    f=1;
                                if(tempO == '-')
                                    f=1;
                                break;
                            case '<':         // <=
                                if(tempO == '=')
                                    f=1;
                                break;
                            case '>':         // >=
                                if(tempO == '=')
                                    f=1;
                                break;       // ==
                            case '=':
                                if(tempO == o)
                                    f=1;
                                break;
                            case '!':
                                if(tempO == '=')
                                {
                                    f=1;
                                    help="!=";
                                }
                                break;
                            case '|':
                                if(tempO==o)
                                {
                                    f=1;
                                    break;
                                }
                        }
                        if(f ==1)
                        {
                            sb = new StringBuilder();
                            sb.append(o);
                            sb.append(tempO);
                            System.out.println("\"" + sb.toString() + "\""+"<Operator>"+help);
                            Datos_TKNS[contador][0]=sb.toString();
                            Datos_TKNS[contador][1]=sb.toString();
                            contador++;
                            System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                            rflag=1;
                        }
                        else
                        {
                            sb= new StringBuilder();
                            sb.append(o);
                            System.out.println("\"" + sb.toString() + "\""+"<Operator>");
                            Datos_TKNS[contador][0]=sb.toString();
                            Datos_TKNS[contador][1]=sb.toString();
                            contador++;
                            System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                            o=tempO;
                            rflag=0;
                        }
                    }
                    else if(pb==6)
                    {
                        int temp = readChar();
                        char tempO= (char) temp;
                        int tempPb= punctuator.isPunctuator(tempO);
                        if(tempPb ==pb)
                        {
                            omitComment();
                        }
                        else
                        {
                            sb= new StringBuilder();
                            sb.append(o);
                            System.out.println("\"" + sb.toString() + "\""+"<Operator>");
                            Datos_TKNS[contador][0]=sb.toString();
                            Datos_TKNS[contador][1]=sb.toString();
                            contador++;
                            System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                            rflag=0;
                            o=tempO;
                        }
                    }
                    else if ((pb >= 5 && pb <= 7) || o=='&')
                    {

                        sb= new StringBuilder();
                        sb.append(o);
                        System.out.println("\"" + sb.toString() + "\""+"<Operator>");
                        Datos_TKNS[contador][0]=sb.toString();
                        Datos_TKNS[contador][1]=sb.toString();
                        contador++;
                        System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                        rflag =1;

                    }
                    else if(pb==17)
                    {
                        String aux_X="";
                        int temp = readChar();
                        char tempO= (char) temp;
                        StringBuilder tempSb= new StringBuilder();
                        tempSb.append(o);
                        tempSb.append(tempO);
                        aux_X+=tempO;
                       while (tempO != '"')
                       {
                           temp = readChar();
                           tempO= (char) temp;
                           tempSb.append(tempO);
                           if(tempO != '"')
                           {
                               aux_X+=tempO;
                           }
                       }
                        System.out.println(tempSb.toString()+"<String Literal>");
                        Datos_TKNS[contador][0]=sb.toString();
                        Datos_TKNS[contador][1]="String"+"."+aux_X;
                        Valores.add(aux_X);
                        contador++;
                        System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                        rflag=1;
                    }
                    else if(o!=' ' && o!='\n' && o!='\r')
                    {
                        sb= new StringBuilder();
                        sb.append(o);
                        System.out.println("\"" + sb.toString() + "\""+"<Separator>");
                        Datos_TKNS[contador][0]=sb.toString();
                        Datos_TKNS[contador][1]=sb.toString();
                        contador++;
                        System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                        rflag =1;
                    }
                    else
                    {
                        rflag=1;
                    }
                    sb = new StringBuilder();
                    continue;
                }
                String s = sb.toString();
                if (keyword.isKeyword(s) == false)
                {
                    // TODO code for automata for identifier and number
                    boolean isIdentifier = Utility.isIdentifier(s);
                    if (isIdentifier)
                    {
                        System.out.println("\"" + s + "\""+"<Identifier>");
                        if(s.equals("printf") || s.equals("scanf") || s.equals("main"))
                        {
                            Datos_TKNS[contador][0]=sb.toString();
                            Datos_TKNS[contador][1]=sb.toString();
                        }
                        else
                        {
                            Datos_TKNS[contador][0]=sb.toString();
                            Datos_TKNS[contador][1]="id"+"."+sb.toString();                            
                            Valores.add(sb.toString());
                            E_Con=Pila.indexOf(sb.toString());
                            if(E_Con == -1)
                            {
                                Datos_L_S[L_S][1]=sb.toString();
                                Datos_L_S[L_S][0]=cont+"";
                                Pila.add(sb.toString());
                                L_S++;
                            }
                        }
                        contador++;
                        System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                    }
                    else if(s.charAt(0)=='\'' && s.charAt(2)=='\'' && s.length()==3)
                    {
                        System.out.println("\"" + s.charAt(1) + "\""+"<Character>");
                        Datos_TKNS[contador][0]=sb.toString();
                        Datos_TKNS[contador][1]="Caracter"+"."+sb.toString();
                        Valores.add(sb.toString());
                        contador++;
                        System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                    }
                    else
                    {
                        int isNumber = Utility.isNumber(s);
                        StringBuilder tempSb = new StringBuilder();
                        if(isNumber!=-1)
                        {
                            if(s.charAt(s.length()-1) == 'e' )
                            {

                                if(o!='+' && o!='-')
                                {
                                    s="Error at "+s;
                                    isNumber=-1;
                                }
                                else {
                                    tempSb.append(o);
                                }
                                    int tempo ;
                                    tempo = readChar();
                                    char tempC=(char)tempo;
                                    while(punctuator.isPunctuator(tempC) ==100)
                                    {

                                        if(tempo >=48 && tempo<=57 && isNumber!=-1)
                                        {
                                            tempSb.append(tempC);
                                        }
                                        else
                                        {
                                            //s="Error at "+s
                                            System.out.print("Error at ");
                                            isNumber=-1;
                                        }
                                        tempo=readChar();
                                        tempC = (char) tempo;
                                    }
                                    rflag=0;
                                    o=tempC;
                                }
                                System.out.print("\"" + s + tempSb.toString()+"\"");
                            if(isNumber==1)
                            {
                                System.out.println("<Decimal Number>");
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]="nint"+"."+sb.toString();
                                Valores.add(sb.toString());
                                contador++;
                                System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                            }
                            else if(isNumber == 2)
                            {
                                System.out.println("<Octal Number>");
                            }
                            else if(isNumber ==3)
                            {
                                System.out.println("<Hexa Number>");
                            }
                            else if(isNumber == 4)
                            {
                                System.out.println("<Floating Number>");
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]="nfloat"+"."+sb.toString();
                                Valores.add(sb.toString());
                                contador++;
                                System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                            }
                        }
                        else
                        {
                            System.out.println("Error at o"+s);
                            System.out.println(s.replaceAll("^\\s*",""));
                            s=s.replaceAll("^\\s*","");
                            String aux_X=sb.substring(0, 1);
                            int bandera = 0;
                            if(numeros.contains(aux_X))
                            {
                                System.out.println("Entro");
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]="nint"+"."+sb.toString();
                                Valores.add(sb.toString());
                                bandera = 1;
                            }
                            if(keyword.isKeyword(s) == true)
                            {
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]=sb.toString();
                                bandera = 1;
                            }
                            if(otros.contains(s))
                            {
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]=sb.toString();
                                bandera = 1;
                            }
                            if(bandera == 0)
                            {
                                Datos_TKNS[contador][0]=sb.toString();
                                Datos_TKNS[contador][1]="id"+"."+s;
                                Valores.add(s);
                                E_Con=Pila.indexOf(s);
                                if(E_Con == -1)
                                {
                                    Datos_L_S[L_S][1]=s;
                                    Datos_L_S[L_S][0]=cont+"";
                                    Pila.add(sb.toString());
                                    L_S++;
                                }
                            }
                            
                            contador++;
                            System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                        }
                    }
                } else
                {
                    System.out.println("\"" + s + "\""+"<Keyword>");
                    Datos_TKNS[contador][0]=sb.toString();
                    Datos_TKNS[contador][1]=sb.toString();
                    contador++;
                    System.out.println("Contador: "+contador+"------------------------------------------------------------->>>");
                }
                // Process Buffer
                // Till Here
                sb = new StringBuilder();
                rflag=0;
            }
        }
        
        Datos_TKNS_ = new String[contador][3];
        int i_X=0;
        for(i_X = 0;i_X < contador;i_X++)
        {
            Datos_TKNS_[i_X][2] = Datos_TKNS[i_X][0];
            Datos_TKNS_[i_X][1] = Datos_TKNS[i_X][1];
            Datos_TKNS_[i_X][0] = Datos_TKNS[i_X][2];
            Tira_Token += Datos_TKNS[i_X][1]+" ";
        }
        Tira_Token += "$";
        System.out.println("Valores del Likenlist:------------------>>>>>>>>>><<<<<<<<<<"+Valores);
        Datos_L_S_ = new String[L_S][2];
        for(int i_ = 0;i_ < L_S;i_++)
        {
            Datos_L_S_[i_][1] = Datos_L_S[i_][1];
            Datos_L_S_[i_][0] = Datos_L_S[i_][0];
        }
    }

    public static int readChar() {
        int c = 1000;
        try {
            c = f1.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return c;
    }
    public static void omitComment()
    {
        int c=0;
        while (c!=10)
        {
            try {
                c = f1.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
