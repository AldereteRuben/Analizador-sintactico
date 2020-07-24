
package colecano;


import analizador.LexicalAnalyser;
import analizador.ModeloDeTabla;
import jacv050.ObtenerPS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Stack;


public class AnaCanonica 
{
    public static ArrayList<String[]> reglas;
    public static ArrayList<String> I_Num = new ArrayList(0);
    public static ArrayList<String> Conjuntos = new ArrayList(0);
    public static ArrayList< ArrayList<String[]> > CC = new ArrayList< ArrayList<String[]> > (0);
    public static int I_N_=1;
    
    public static int q=0;
    public static int My_Cont=0;
    
    public static String A="";
    public static String B="";
    public static String C="";
    public static String D="";
    public static String E="";
    public static String F="";
    public static String G="";
    public static String H="";
    public static String I="";
    public static String J="";
    public static String K="";
    public static String L="";
    public static String M="";
    public static String N="";
    public static String NN="";
    public static String P="";
    public static String Q="";
    public static String R="";
    public static String S="";
    public static String T="";
    public static String U="";         
    public static String V="";
    public static String W="";
    public static String X="";
    public static String Y="";
    public static String Z="";
    public static String AA="";
    public static String AB="";
    public static String AC="";
    public static String BB="";
    public static String AD="";
    public static String AE="";
    public static String AF="";
    public static String AG="";
    public static String AH="";
    public static String AI="";
    public static String AL="";
    public static String AZ="";
    public static String PR="";
    public static String CAC="";
    public static String XB="";
    public static String PL="";
    public static String PQ="";
    public static String AJ="";
    public static String ID="";
    public static String KR="";
    public static String AM="";
    public static String CO="";
    public static String JP="";
    public static String BA="";
    public static String OP="";
    public static String DD="";
    public static String SIG="";
    public static String GN="";
    public static String FI="";
    public static String YF="";
    public static String JJ="";
    public static String NXT="";
    
    public static String Vo="";
    
    
    public static int Box02=0;
    public static int ban_I=0;
    public static int ban_R=0;
    public static int ban_G=0;
    public static int ban_AZ=0;
    public static int ban_GG=0;
    public static int ban_E=0;
    public static int ban_Y=0;
    
    public static int contador=0;
    
    public static int E_E=0;
    public static int T_T=0;
    public static int F_F=0;
    
    
    public static String resultado="";
    public static String resultado_NEW="";
    public static String Lista_Reglas[]={};
    public static String Lista_Reglas_X[]={};
    public static String Lista_Accion_Semantica[] = {};
    //public static String Lista_Bus_Siguientes[]={};
    public static String Lista_Bus_Siguientes_X[]={};
    public static String Lista_Auxiliar=""; 
    public static String Primero="";
    public static String Primero_X="";
    public static String Segundo="";
    
    public static String Datos[][]={};
    public static String Datos_X[][]={};
    public static String Datos_X_[][]={};
    
    public static String ListaTitulo="";
    public static String SubTitulos[]={};
    public static String InformacionTab[][]={};
    
    public static String tokens[]={};
    public static Stack<String> Pila = new Stack<String>();
    public static LinkedList<String> Var = new LinkedList<String>();
    public static LinkedList<String> Type = new LinkedList<String>();
    public static LinkedList<String> Begin = new LinkedList<String>();
    public static LinkedList<String> ArregloND = new LinkedList<String>();
    public static int ArrayND=0;
    
    public static LinkedList<String> Operacion = new LinkedList<String>();
    public static int OpeN=0;
    
    public static LinkedList<String> Link_I = new LinkedList<String>();
    public static int Cont_I=0;
    
    public static LinkedList<String> Operadores = new LinkedList<String>();
    public static int OperaD=0;
    
    public static LinkedList<String> Contenido = new LinkedList<String>();
    public static int ConteN=0;
    
    public static LinkedList<String> Pila_M = new LinkedList<String>();
    public static int ConM=0;
    
    public static LinkedList<String> Pila_K = new LinkedList<String>();
    public static int ConK=0;
    
    public static LinkedList<String> Pila_Y = new LinkedList<String>();
    public static int ConY=0;
    
    public static LinkedList<String> Pila_AZ = new LinkedList<String>();
    public static int ConAZ=0;
    
    public static LinkedList<String> Pila_G = new LinkedList<String>();
    public static int ConG=0;
    
    public static LinkedList<String> Pila_AI = new LinkedList<String>();
    public static int ConAI=0;
    
    public static LinkedList<String> Pila_S = new LinkedList<String>();
    public static int ConS=0;
    
    public static LinkedList<String> Pila_AA = new LinkedList<String>();
    
    public static String accion="";
    public static String TxT="No se encontraron errores";
    public static String TxT_0="SIN RESPUESTA";
    public static String TxT_1="SIN ALERTAS";
    
    public AnaCanonica(String Linkeles,String Accion_S,int ban_Acc)
    {
                int CONTADOR=0;
		int llamadas = 1;
		ArrayList<String> iras = new ArrayList();                 
		String Cad_Acep = "ACEPTAR";
		reglas = Leer_Gramatica(Linkeles,Accion_S);
		String[] I0 = { reglas.get(0)[0]+"'",".",reglas.get(0)[0],"$"};

		ArrayList<String[]> tmp = new ArrayList<String[]>(0);
		tmp.add(I0);
		
		
		CC.add(ce(tmp)); //I0 
		I_Num.add("I_0");
		
		System.out.print("I_0 = ");
		Impresion_I(ce(tmp));
		System.out.println("");
		Conjuntos.add(Cadena_Cad(CC.get(0)));
                
		int contI=1;
		int conj;
		int aceptado=0;
		int INDacep = 0;
		for(int i=0; i<CC.size();i++){// recorre todos los Conjuntos I_n
			if(i>400) break;
			ArrayList<String[]> copia = nuevoAL(CC.get(i));
			boolean pasarSig=false;
			int ind=0,k;
			boolean sig = false;
			while(copia.isEmpty()==false){
				sig = false;
				if(copia.get(ind)[0].equals(Cad_Acep)){
					aceptado++;
					INDacep = i-aceptado;
					copia.remove(ind);
					sig=true;
					break;
				}
				for(k=0; k<copia.get(ind).length && sig==false; k++){
					if(copia.get(ind)[k].equals(".") && k<copia.get(ind).length-1){
						llamadas++;
						System.out.print("\nIr_a(I_"+i+","+copia.get(ind)[k+1]+" ) =");
						iras.add("Ir_a(I_"+Integer.toString(i-aceptado)+","+copia.get(ind)[k+1]+")");
						if(copia.get(ind)[k+1].equals("$")){
							String[] aux = {Cad_Acep};
							ArrayList<String[]> auxL = new ArrayList<String[]>(0);
							auxL.add(aux);
							CC.add(nuevoAL(auxL));
							copia.remove(0);
							I_Num.add(Cad_Acep);
							String y = " ";
							Conjuntos.add(y);
						}else
                                                {
							tmp = Ir_a(copia,copia.get(ind)[k+1]);
							if(tmp!=null)
                                                        {
								conj = Verificar_Conjunto(CC, tmp);
								if(conj<0){
									System.out.print("\nI_"+contI+"= ");
									Impresion_I(tmp);
									I_Num.add("I_"+contI);
									contI++;
                                                                        I_N_++;
									CC.add(nuevoAL(tmp));
									Conjuntos.add(Cadena_Cad(tmp));
									System.out.print("\nTrancision Nueva\n");
									break;
								}else{
									if(conj>INDacep){
										I_Num.add("I_"+Integer.toString(conj-aceptado));
									}else{
										I_Num.add("I_"+Integer.toString(conj));
									}
									String y = " ";
									Conjuntos.add(y);									
								}
							}else{
							}
							 
							break;
						}
					}else if((copia.get(ind)[k].equals(".") && k==copia.get(ind).length-1)&& copia.size()>1){
						sig = true;
						Imp_String_Vectorial(copia.get(ind));
						copia.remove(ind);
						Imp_String_Vectorial(copia.get(ind));
						break;
					}else if((copia.get(ind)[k].equals(".") && k==copia.get(ind).length-1)&& copia.size()==1){
						copia.remove(ind);
						break;
					}
					if(copia.isEmpty())
						break;
				}
			}
		}
		System.out.println("\n\n"+llamadas);
                Datos = new String[llamadas][3];                
		Imp_Coleccion(CC);                
		Escribir_Archivo(CC,llamadas,iras,Cad_Acep);
                int Ay=Box02;
                Derivaciones_Ana_Sintac(Ay);
    }
    
    private static String Cadena_Cad(ArrayList<String[]> s) {
		String scat = "{";
		for(int i=0; i<s.size(); i++){
			scat+="[";
			for(int j=0; j<s.get(i).length; j++){
				if(j==s.get(i).length-1)
					scat+=s.get(i)[j];
				else
					scat+=s.get(i)[j]+" ";
			}
			scat+="]";
		}
		scat+="}";
		return scat;
	}

	private static void Imp_Coleccion(ArrayList<ArrayList<String[]>> cC) {
		// TODO Auto-generated method stub
		System.out.println("\n\nCOLECCION CANONICA");
		for(int i=0; i<cC.size(); i++){
			if(i<6){
				System.out.print("I_"+i+": ");
			}else if(i>6){
				System.out.print("I_"+Integer.toString(i-1)+": ");
			}else{
				System.out.print("I_$: ");
			}
			Impresion_I(cC.get(i));
			System.out.print("\n");
		}
		System.out.println("\n");
	}

	public static ArrayList<String[]> nuevoAL(ArrayList<String[]> L){
		ArrayList<String[]> I = new ArrayList() ;
		for(int i=0; i<L.size(); i++){
			String sv[] = {};
			for(int j=0; j<L.get(i).length; j++){
				String s = new String(L.get(i)[j]);
				sv = Arrays.copyOf(sv, sv.length + 1);
				sv[sv.length-1]= s;
			}
			I.add(sv);
		}
		return I;
	}
	public static String[] nuevoSV(String[] L){	
		String[] sv = {} ;
		for(int i=0; i<L.length; i++){
			String s = new String(L[i]);
			sv = Arrays.copyOf(sv, sv.length + 1);
			sv[sv.length-1]= s;
		}
		return sv;
	}

	public static void Impresion_I(ArrayList<String[]>I)
        {                           
		for(int i=0; i<I.size(); i++){
			System.out.print("[");
			for(int j=0; j<I.get(i).length; j++){
				System.out.print(I.get(i)[j]+" ");
			}
			System.out.print("] ");
		}
	}
        
        public static int contarCaracteres(String cadena, char caracter) 
        {
            int posicion, contador = 0;
            //se busca la primera vez que aparece
            posicion = cadena.indexOf(caracter);
            while (posicion != -1) { //mientras se encuentre el caracter
                contador++;           //se cuenta
                //se sigue buscando a partir de la posición siguiente a la encontrada
                posicion = cadena.indexOf(caracter, posicion + 1);
            }
            return contador;
        }
        
        public static void Derivaciones_Ana_Sintac(int ban_Acc)
        {            
            Datos_X = new String[900][3];
            Pila.push("0");
            int i=0;
            int cnt=0;
            int i_X=0;
            int iax=0;
            int con =0;
            int con_x=0;
            int pri = 0;
            int bandera=0;            
            int aceptar=0;
            int contador=0;
            int val_numerico=0;
            int conR=0;
            int iasd=0;
            
            String s="";
            String a="";
            String A_a="";
            String d_r="";
            String Num="";
            String Regla="";
            String Regla_X="";
            String agregar="";
            String agregar_X="";
            String Concatenar="";
            String A_xx="";
            String pila="";
            String TxT_="";
            String divide ="";
            String numero = "";
            String numeros = "";
            String abecedario="abcdefghijklmnñopqrstuvwxyz";
            String[] cade = new String[15];
            String[] idid = new String[15];
            String[] numero03 = new String[15];
            String accion_seman = "";
            
            //System.out.println(":::ListaTitulos"+ListaTitulo);
            //Var.add("Var");
            Type.add("Type");
            
            
            while(aceptar == 0)
            {
                s = Pila.peek();
                a = tokens[i_X];
                pila="";
                for(int y=i_X;y<tokens.length;y++)
                {
                    pila += tokens[y];
                }
                Datos_X[contador][1]=pila;
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Valor de s:"+s);
                System.out.println("Valor de a:"+a+"-----");
                
                pila="";
                for(int x=0;x<Pila.size();x++)
                {
                    pila += Pila.get(x)+" ";
                }
                System.out.println("Valor de Pila::::::"+pila);
                Datos_X[contador][0]=pila;
                int band=0;
                divide="";                
                for (int n=0;n<a.length();n++)
                {
                     char c = a.charAt(n);
                     if (c=='.')
                     {
                         band=1;
                     }
                     if (band==0)
                     {
                         divide+=c+"";
                     }
                }
                
                if(numero == "" || abecedario.contains(numero))
                {
                    numero="0";
                }
                if(ban_Acc != 2 && ban_Acc < 3)
                {
                    val_numerico = Integer.parseInt(numero);
                }
                
                for (int k=0;k<SubTitulos.length;k++)
                {
                    for(int q=0;q<SubTitulos.length;q++)
                    {   
                        if(divide.equals(SubTitulos[q]))
                        {
                            bandera=0;
                            break;
                        }
                        else
                        {
                            bandera=1;
                        }
                    }
                    if(bandera == 1)
                    {
                        aceptar = 2;
                        System.out.println("No se encontro en la lista de simbolos:");    
                        TxT_1="NO SE ENCONTRO ALGUN TERMINAL EN LA LISTA DE SIMBOLOS";
                        break;
                        
                    }
                    if(divide.equals(SubTitulos[k]))
                    {
                        accion = InformacionTab[Integer.parseInt(s)][k];
                        if(accion == null)
                        {
                            aceptar = 2;
                            pri = Primero_X.length();
                            TxT_="";
                            for(int w=1;w<SubTitulos.length-pri;w++)
                            {
                                if(InformacionTab[Integer.parseInt(s)][w] != null)
                                {
                                    System.out.println("Se esperaba: "+ SubTitulos[w]);
                                    TxT_+=SubTitulos[w]+"   ";
                                }
                            }
                            TxT="Error, se esperaba: "+TxT_;
                            break;                            
                        }
                        System.out.println("Valor de accion:"+accion);
                        System.out.println("Valor de d_r_0-1:"+accion.substring(0, 1));
                        d_r = accion.substring(0,1);                        
                        Num = accion.substring(1,accion.length());
                        System.out.println("Valor de d_r_1-2:"+Num);
                        if(accion.equals("Aceptar"))
                        {
                            aceptar = 1;
                            Datos_X[contador][2]="Aceptar";
                        }                        
                        if(d_r.equals("d"))
                        {
                            Datos_X[contador][2]=accion;
                            Pila.push(a);
                            System.out.println("Valor de la Pila:"+Pila.peek());
                            
                            String aux_Accion="";
                            aux_Accion = Pila.peek();
                            int band_Ax=0;
                            numero="";
                            A_xx="";
                            if(ban_Acc < 3)
                            {
                                for(int fas=0;fas<aux_Accion.length();fas++)
                                {
                                    char c=aux_Accion.charAt(fas);
                                    if(c == '.')
                                    {
                                        band_Ax=1;
                                        continue;
                                    }
                                    if(band_Ax == 1)
                                    {
                                        numero += c+"";
                                        A_xx += c+"";
                                    }
                                }
                                if(divide.equals("id"))
                                {
                                    idid[con_x]=A_xx;
                                    con_x++;
                                    iasd=con_x;
                                }
                                if(divide.equals("nint"))
                                {
                                    numero03[cnt] = numero;
                                    cnt++;
                                }
                                if(abecedario.contains(numero) && numero != "")
                                {
                                    cade[conR] = numero;
                                    conR++;
                                    iax = conR-1;
                                }
                            }
                            
                            Pila.push(Num);
                            System.out.println("Valor de la Pila:"+Pila.peek());
                            i_X++;
                        }
                        if(d_r.equals("r"))
                        {
                            int Num_eracion = Integer.parseInt(Num);
                            Num_eracion = Num_eracion -1;
                            Concatenar = accion +"  "+Lista_Reglas_X[Integer.parseInt(Num)-1];
                            Concatenar += "     "+Lista_Accion_Semantica[Num_eracion];
                            System.out.println("Lista_Accion_Semantica:::::"+Lista_Accion_Semantica[Num_eracion]);                           
                            
                            System.out.println("  Num_eracion: "+Num_eracion+"val_numerico: "+accion_seman+"   -----------<<<<<<<<<<<<<<<<<<<<<<<<");
                            //Accion_Semantica(ban_Acc,Num_eracion,val_numerico,numeros); // 
                            if((Num_eracion == 0 || Num_eracion == 1) && iax >= 0 && ban_Acc == 1)
                            {
                                numeros = cade[iax];
                                iax--;
                            }
                            if(ban_Acc == 2 && Num_eracion == 1)
                            {
                                numeros = idid[0];
                            }
                            if(ban_Acc == 2 && Num_eracion == 2 && iasd >= 0)
                            {
                                numero = numero03[iasd];
                                val_numerico = Integer.parseInt(numero);
                                iasd--;
                            }
                            if(ban_Acc == 0 || ban_Acc == 1 || ban_Acc == 2)
                            {
                                Now_Accion_Semantica(ban_Acc,Num_eracion,val_numerico,numeros);
                            }
                            if(ban_Acc == 3)
                            {
                                Accion_Semantica(Num_eracion);
                            }                            
                            
                            
                            accion = Concatenar;
                            Datos_X[contador][2]=accion;
                            System.out.println("Valor de Concatenar:"+Concatenar+"  Numeracion: "+Num+"-1   ------------------------------------------------------------------------------");
                            Regla = Lista_Reglas_X[Integer.parseInt(Num)-1];
                            //hacer token para Regla_X;
                            String ayuda="";
                            Regla_X = Regla.toString();
                            StringTokenizer sts = new StringTokenizer(Regla_X);
                            String[] stri = new String[sts.countTokens()];
                            int ff = 0;
                            while (sts.hasMoreTokens()) {
                                stri[ff] = new String(sts.nextToken()); 
                                if(ff >= 1)
                                {
                                    ayuda += stri[ff]+" ";
                                }
                                ff++;
                            }                            
                            Regla_X = ayuda;
                            System.out.println("Valor de Regla_X:"+Regla_X);
                            
                            StringTokenizer st = new StringTokenizer(Regla_X);
                            int f = 0;
			    while (st.hasMoreTokens()) {
                                agregar = new String(st.nextToken()); 
			        f++;
			    }
                            if(agregar.equals("epsilon"))
                            {
                                f=0;
                            }
                            con = f*2;
                            //hacer token para A_a
                            A_a = Regla;
                            String help="";
                            StringTokenizer sta = new StringTokenizer(A_a);
                            String[] stris = new String[sta.countTokens()];
                            int fa = 0;
                            while (sta.hasMoreTokens()) {
                                stris[fa] = new String(sta.nextToken()); 
                                if(fa == 0)
                                {
                                    help = stris[fa];
                                }
                                fa++;
                            } 
                            A_a=help;
                            //A_a = Regla.substring(0, 1);
                            System.out.println("Valor de la Pila:"+Pila.peek()+"con:"+con+"A_a:::"+A_a+"***************************************");
                            for(int aa=0;aa<con;aa++)
                            {
                                Pila.pop();
                            }
                            System.out.println("Valor de la Pila:::::::::::::"+Pila.peek());
                            s=Pila.peek();
                            for(int z=0;z<SubTitulos.length;z++)
                            {
                                if(A_a.equals(SubTitulos[z]))
                                {
                                    agregar_X = InformacionTab[Integer.parseInt(s)][z];
                                }
                            }                            
                            System.out.println("Valor de Agre_X:"+agregar_X);
                            Pila.push(A_a);
                            
                            System.out.println("Valor de la Pila:::::::::::::"+Pila.peek());
                            
                            agregar_X = agregar_X.substring(1,agregar_X.length());
                            Pila.push(agregar_X);
                            System.out.println("Valor de la Pila----:::::::::::::"+agregar_X.substring(1, agregar_X.length()));
                        }
                    }
                }  
                contador++;
            }
            if(aceptar == 1)
            {                
                System.out.println("ACEPTAR:::::ACEPTAR>>>>");
                //System.out.println("Linkeslist:"+Var.get(0).toString());
                TxT_0="SE ACEPTO!!!";                
            }
            if(aceptar == 2)
            {
                System.out.println("NO SE ACEPTO");
                TxT_0="NO SE ACEPTO";
            }
            Datos_X_ = new String[contador][3];
            for(int ii=0;ii<contador;ii++)
            {
                for(int jj=0;jj<3;jj++)
                {
                    Datos_X_[ii][jj]=Datos_X[ii][jj];
                }
            }                        
            String Answer="";
            String Type_V[]={"integer","real","boolean","char"};
            String Type_A="";
            String Type_AA="";
            String Array="";
            int Type=0;
            int CoSeN=0;
            int Con_Veces=0;
            int llave=0;
            StringTokenizer st = new StringTokenizer(resultado);
            String[] stringTmp = new String[st.countTokens()];
            int ii = 0;
            String Auxiliar="";                
            while (st.hasMoreTokens()) 
            {
                stringTmp[ii] = new String(st.nextToken());                    
                Auxiliar=stringTmp[ii]+"";                
                if(Auxiliar.equals("V_N"))
                {
                    Auxiliar=LexicalAnalyser.Valores.get(My_Cont).toString();
                    My_Cont++;
                }
                if(Auxiliar.equals("¬"))
                {
                    Auxiliar="\n";
                }
                if(Auxiliar.equals("¬S"))
                {
                    Auxiliar="";
                    My_Cont++;
                }
                for(int Ty=0;Ty<Type_V.length;Ty++)
                {
                    if(Auxiliar.equals(Type_V[Ty]))
                    {
                        Type=1;                                                
                        CoSeN=1;
                        Pila_AA.add(Auxiliar);
                    }
                }
                
                if(Type == 1)
                {
                    if(CoSeN==1)
                    {
                        Type_A+="";
                        CoSeN=0;
                        Auxiliar="";
                    }
                    else if(Auxiliar.equals(","))
                    {
                        Type_A+=" "+Auxiliar+" ";
                        Auxiliar="";
                    }                    
                    else if(Auxiliar.equals(";"))
                    {
                        Type=0;
                        Type_A+=" "+Auxiliar;
                        Var.add(Type_A);
                        Type_A="";
                        Auxiliar="";
                    } 
                    else
                    {
                        Type_A+=Auxiliar;
                        Auxiliar="";
                    }
                }
                Answer+=Auxiliar+" ";
                ii++;                    
            } 
            resultado=Answer;
            
            int Con_AA=0;
            for(int Ar=0;Ar<Var.size();Ar++)
            {
                String Tope=Var.get(Ar);
                
                StringTokenizer sta = new StringTokenizer(Tope);
                String[] stringTp = new String[sta.countTokens()];
                int ia = 0;
                String Auxi="";                
                while (sta.hasMoreTokens())
                {
                    stringTp[ia] = new String(sta.nextToken());                    
                    Auxi=stringTp[ia]+"";
                    System.out.println("Auxiliar::::"+Auxi+"----");
                    llave=0;
                    if(Auxi.contains("["))
                    {
                        Con_Veces=contarCaracteres(Auxi,']');
                        System.out.println("Contador de repeticiones:"+Con_Veces);
                        int con_V=0;
                        for(int n_i=0;n_i<Auxi.length();n_i++)
                        {
                            char c=Auxi.charAt(n_i);
                            System.out.println("Caracter:"+c);
                            if(c=='[')
                            {
                                if(llave==0)
                                {
                                    Array+=":ARRAY[0..";
                                    llave=1;
                                }
                                else
                                {
                                    Array+=",0..";
                                }
                            }
                            else if(c==']')
                            {   
                                System.out.println("Comparador de contadores::::"+con_V+"----"+Con_Veces+"---");
                                if(con_V == (Con_Veces-1))
                                {
                                   Array+="] OF "+Pila_AA.get(Con_AA); 
                                }
                                else if(Con_Veces == 0)
                                {
                                    Array+="]";
                                }
                                else if(Con_Veces > 0 && con_V < (Con_Veces-1))
                                {
                                    Array+="";
                                    con_V++;
                                }
                            }                                                        
                            else
                            {
                                System.out.println("OTROS--------");
                                Array+=c+"";
                            }
                        }
                    }                    
                    else if(Auxi.equals(","))
                    {
                        Array+=";"+"\n";
                    }
                    else if(Auxi.equals(";"))
                    {
                        System.out.println("Finalizacion de declaracion*");
                        Array+=";"+"\n";
                        Type=0;
                        Con_AA++;
                    }
                    else
                    {
                         Array+=Auxi+" : "+Pila_AA.get(Con_AA);
                    }
                    
                    ia++;
                }
                
            }
            resultado="Var\n"+Array+resultado;
            //System.out.println("Valores de T"+Operacion+"tamaño"+Operacion.size());
        }
        
        public static void Now_Accion_Semantica(int ban_Acc,int Num,int val_numerico,String val_nume)
        {
            int bandera_Acc = ban_Acc;
            if(bandera_Acc == 0)
            {
                switch(Num)
                {
                    case 0:
                        E_E = E_E + T_T;
                        break;
                    case 1:
                        E_E = T_T;
                        break;
                    case 2:
                        T_T = T_T * F_F;
                        break;
                    case 3:
                        T_T = F_F;
                        break;
                    case 4:
                        F_F = E_E;
                        break;
                    case 5:
                        F_F = val_numerico;
                        break;
                    default:
                        break;
                }
                resultado_NEW="Resultado:  "+E_E+" ";
            }
            if(bandera_Acc == 1)
            {
                resultado_NEW = "Resultado:  ";
                switch(Num)
                {
                    case 0:
                        S = "var "+val_nume+L+":"+P+";";
                        resultado_NEW+=S+" ";
                        break;
                    case 1:
                        L = ", "+val_nume+L;
                        resultado_NEW += L+" ";
                        break;
                    case 2:
                        L = "";
                        resultado_NEW += L+" ";
                        break;
                    case 3:
                        P = "real";
                        resultado_NEW += P+" ";
                        break;
                    case 4:
                        P = "integer";
                        resultado_NEW += P+" ";
                        break;
                    default:
                        break;
                }
            }
            if(bandera_Acc == 2)
            {
                resultado_NEW="Resultado: ";
                switch(Num)
                {
                    case 0:
                        N = "var "+V+X+";";
                        resultado_NEW += N+" ";
                        break;
                    case 1:
                        if(W != "")
                        {
                            V = val_nume+":"+"array ["+W;
                            resultado_NEW += V+" ";
                        }
                        else
                        {
                            Vo=W;
                            V=val_nume+":"+Vo;
                            resultado_NEW+= V+" ";                            
                        }
                        break;
                    case 2:
                        if(W == "")
                        {
                            W="0.."+(val_numerico-1)+"] of ";
                            resultado_NEW += W+" ";
                        }
                        else
                        {
                            W="0.."+(val_numerico-1)+","+W;
                            resultado_NEW += W+" ";
                        }
                        break;
                    case 3:
                        W="";
                        resultado_NEW += W+" ";
                        break;
                    case 4:
                        X="integer";
                        resultado_NEW+= X+" ";
                        break;
                    case 5:
                        X="char";
                        resultado_NEW+=X+" ";
                        break;
                    case 6:
                        X="real";
                        resultado_NEW+=X+" ";
                        break;
                    default:
                        break;
                }
            }
        }
        
        public static void Accion_Semantica(int Num)
        {
            String val_nume=" V_N ";
            System.out.print("***********************"+Num);
            switch (Num)
            {
                case 0:
                     A=B+C+D+E;
                     resultado += A+" ¬ ";
                     break; 
                     
                case 1: 
                    System.out.print("No se contempla");
                    break;
                     
                case 2:
                    B="";
                    break;
                case 3:
                    C="begin"+" ¬ ";
                    //Begin.add(C);
                    break;
                    
                case 4:
                    System.out.print("No se contempla");
                    break;
                 
                case 5:
                    F="";
                    break;
                    
                case 6: 
                    int c_GN=Pila_G.size()-1;
                    GN=Pila_G.get(c_GN);
                    E=GN+AJ;
                    Pila_G.remove((Pila_G.size()-1));
                    //ConG++;
                    //ban_GG=1;
                    Contenido.add(E);
                    if(ban_E==1)
                    {
                        ban_E=0;
                        ConteN=0;
                    }
                    break;
                
                case 7:                    
                    GN=G;
                    Pila_G.add(GN);
                    /*if(ban_GG==1)
                    {
                        ConG=0;
                        ban_GG=0;
                    }*/
                    break;
                    
                case 8:
                    int c_AZ=Pila_AZ.size()-ConAZ-1;
                    AZ=Pila_AZ.get(c_AZ);
                    G=AZ+G;
                    ban_AZ=1;
                    ConAZ++;
                    break;
                    
                case 9:
                    int c_Y=Pila_Y.size()-ConY-1;
                    YF=Pila_Y.get(c_Y);
                    G=YF+G;
                    ban_Y=1;
                    ConY++;
                    break;
                case 10:
                    System.out.println("VALOR DE pila::::-------*****____"+Link_I);
                    //Cont_I++;
                    int cnt=(Link_I.size()-1);
                    System.out.println("VALOR DEL INDEX::::-------*****____"+cnt+" ::: "+Link_I.size()+" - ("+Cont_I+" - 1)");
                    FI=Link_I.get(cnt);
                    System.out.println("VALOR DE FI::::-------*****____"+FI);
                    G=FI+G;                    
                    //ban_G=1;
                    Link_I.remove((Link_I.size()-1));
                    System.out.println("VALOR DE pila::::-------*****____"+Link_I);                    
                    //contador--;
                    break;
                case 11:
                    G=PR+G;
                    break;
                case 12:
                    G=PL+G;
                    break;
                case 13:
                    G=PQ+G;
                    break;
                case 14:
                    G="";
                    break;
                    
                case 15:
                    AZ=H;
                    Pila_AZ.add(AZ);
                    if(ban_AZ==1)
                    {
                        ConAZ=0;
                        ban_AZ=0;
                    }
                    break;                   

                case 16:
                    AZ="";
                    break;
                case 17:
                    AJ="end.";
                    //Begin.add(AJ);
                    break;
                    
                case 18:
                    AJ="";
                    break;  
                case 19:
                    if(Q=="*")
                    {
                        int c_Ma=Pila_M.size()-ConM-1;
                        M=Pila_M.get(c_Ma);
                        H=J+K+M+L+" ;"+" ¬ "+H;                        
                        ConM++;
                    }
                    else if(Q=="")
                    {
                        int c_Ma=Pila_M.size()-ConM-1;
                        M=Pila_M.get(c_Ma);
                        H=J+K+M+L+" ;"+" ¬ "+H;
                        ConM++;                        
                    }
                    break;
                case 20:
                    H="";
                    break;
                case 21:                    
                    //L=","+val_nume+L;
                    int c_M=Pila_M.size()-ConM-1;
                    int c_K=Pila_K.size()-ConK-1;
                    M=Pila_M.get(c_M);
                    K=Pila_K.get(c_K);
                    L=" ,"+Q+K+M+L;
                    ConM++;
                    ConK++;
                    break;
                case 22:
                    L="";
                    break;
                case 23:
                    J=" real ";   //real float
                    //Var.add("real");
                    break;
                case 24:
                    J=" integer ";    //integer
                    //Var.add("integer");
                    break;
                case 25:
                    J=" boolean ";   //boolean
                    //Var.add("boolean");
                    break;
                case 26:
                    J=" char ";   //char
                    //Var.add("char");
                    break;
                case 27:
                    K=val_nume+AL;
                    Pila_K.add(K);
                    break;
                case 28:
                    AL="["+NN+"]"+AL;
                    break;
                case 29:
                    AL="";
                    break;
                case 30:
                    M=":="+N; //M=":="+N+R;
                    Pila_M.add(M);
                    break;
                case 31:
                    //M="("+N+")";    //M="("+N+P+")";
                    M="("+DD+P+")";
                    break;
                case 32:
                    M="";
                    Pila_M.add(M);
                    break;
                case 33:
                    N="&";
                    break;
                case 34:
                    N=val_nume;
                    break;
                case 35:
                    N=val_nume;
                    break;
                case 36:
                    NN=val_nume;
                    break;
                case 37:
                    NN=val_nume;
                    break;
                case 38:
                    R=K; 
                    ArregloND.add(R);
                    if(ban_R==1)
                    {
                        ArrayND=0;
                        ban_R=0;
                    }
                    break;
                case 39:
                    R="";
                    break;
                case 40:
                    P=" ,"+DD+P;
                    break;
                case 41:
                    P="";
                    break;
                case 42:
                    DD=val_nume;
                    break;
                case 43:
                    DD=val_nume;
                    break;
                case 44:
                    Q="*";
                    break;
                case 45:
                    Q="";
                    break;
                case 46:
                    FI=I;                    
                    //String aa="";
                    //int c_C=(Link_I.size()-contador-1);
                    //int C_Aux=(Link_I.size()-1);
                    Link_I.add(FI);
                    System.out.println("Bandera:"+ban_G+"-----------"+"contenido:::"+FI);
                    break;
                case 47:
                    int Arra=ArregloND.size()-ArrayND-1;
                    int Opera=Operacion.size()-OpeN-1;
                    int c_S=Pila_S.size()-1;
                    R=ArregloND.get(Arra); 
                    SIG=Operacion.get(Opera);
                    S=Pila_S.get(c_S);
                    I=R+S+SIG+";"+" ¬ "+I;  
                    Pila_S.remove((Pila_S.size()-1));
                    ArrayND++;
                    OpeN++;
                    ban_I=1;
                    ban_R=1;
                    break;
                case 48:
                    int c_A=ArregloND.size()-ArrayND-1;
                    int c_SS=Pila_S.size()-1;
                    R=ArregloND.get(c_A);
                    S=Pila_S.get(c_SS);
                    I=R+S+ID+";"+" ¬ "+I;
                    Pila_S.remove((Pila_S.size()-1));
                    ArrayND++;
                    break;
                case 49:            ///// esta mal de aqui
                    I="";
                    break;
                case 50:
                    ID=val_nume;
                    break;
                case 51:
                    ID=val_nume;
                    break;
                
                case 52:
                    if(U=="")
                    {
                        S=U+":=";
                        Pila_S.add(S);
                    }
                    else
                    {
                        S=U+"=";
                        Pila_S.add(S);
                    }
                    break;
                case 53:
                    U = "/";
                    break;
                case 54:
                    U = "*";
                    break;
                case 55:
                    U = "+";
                    break;
                case 56:
                    U = "-";
                    break;
                case 57:
                    U="";
                    break;
                case 58:
                    SIG=T;
                    Operacion.add(T); 
                    if(ban_I==1)
                    {
                        OpeN=0;
                        ban_I=0;
                    }
                case 59:
                    T=T+V+W;
                    //Operacion.add(T);                    
                    break;
                case 60:
                    T=W;
                    //Operacion.add(T);
                    break;
                case 61:
                    W=NN;
                    break;
                case 62:
                    W="("+T+")";
                    break;
                case 63:
                    V=U;
                    break;
                case 64:
                    YF=Y;
                    Pila_Y.add(YF);
                    if(ban_Y==1)
                    {
                        ConY=0;
                        ban_Y=0;
                    }
                    break;
                case 65:
                    int co_N=Contenido.size()-ConteN-1;
                    E=Contenido.get(co_N);
                    Y="for "+X+" to "+" ¬S "+val_nume+" do"+" ¬S "+" ¬ "+"begin"+" ¬ "+E+" ¬ "+"end;"+" ¬ "+Y;
                    Operadores.remove((Operadores.size()-1));
                    OperaD++;
                    ConteN++;                    
                    break;
                case 66:
                    Y="";
                    break;
                case 67:
                    X=BB+val_nume+M+";";
                    break;
                case 68:
                    BB=J;
                    break;
                case 69:
                    BB="";
                    break;
                case 70:
                    AB="<";
                    Operadores.add(AB);
                    break;
                case 71:
                    AB="<=";
                    Operadores.add(AB);
                    break;
                case 72:
                    AB=">";
                    Operadores.add(AB);
                    break;
                case 73:
                    AB=">=";
                    Operadores.add(AB);
                    break;
                    
                case 74:
                    AB="!";
                    Operadores.add(AB);
                    break;    
                 
                case 75:
                    AB="!=";
                    Operadores.add(AB);
                    break;
                case 76:
                    AB="==";
                    Operadores.add(AB);
                    break;
                case 77:
                    AB="&&";
                    Operadores.add(AB);
                    break;
                case 78:
                    AB="||";
                    Operadores.add(AB);
                    break;
                case 79:
                    AA=K+"++";
                    break;
                case 80:
                    AA=K+"--";
                    break;
                case 81:
                    int ope=Operadores.size()-1;
                    int co_NN=Contenido.size()-ConteN-1;
                    E=Contenido.get(co_NN);
                    AB=Operadores.get(ope);
                    Y="while("+AD+AB+AE+") do"+" ¬ "+"begin"+" ¬ "+E+" ¬ "+"end;"+" ¬ "+Y;
                    Operadores.remove((Operadores.size()-1));
                    ban_E=1;
                    //OperaD++;
                    ConteN++;
                    break;
                case 82:
                    int oper=Operadores.size()-1;
                    int co_nN=Contenido.size()-ConteN-1;
                    E=Contenido.get(co_nN);
                    AB=Operadores.get(oper);
                    Y="if("+AD+AB+AE+") then"+" ¬ "+"begin"+" ¬ "+E+"end"+" ¬ "+AC+Y; 
                    Operadores.remove((Operadores.size()-1));
                    ban_E=1;
                    //OperaD++;
                    ConteN++;
                    break;
                case 83:
                    int co_nNn=Contenido.size()-ConteN-1;
                    E=Contenido.get(co_nNn);
                    AC="else"+" ¬ "+"begin"+" ¬ "+E+" ¬ "+"end;"+" ¬ ";
                    ban_E=1;
                    ConteN++;
                    break;
                case 84:
                    AC="";
                    break;
                case 85:
                    AE = AD;
                    break;
                case 86:
                    AD=SIG;
                    break;
                case 87:
                    AD = NN;
                    break;
                case 88:
                    Y="case "+val_nume+" of"+" ¬ "+AF+" ¬ "+Y;                    
                    break;
                case 89:
                    int c_ggN=Pila_G.size()-1;
                    GN=Pila_G.get(c_ggN);
                    AI=val_nume+" : "+"begin"+" ¬ "+GN+"end;"+" ¬ ";
                    Pila_G.remove((Pila_G.size()-1));
                    Pila_AI.add(AI);
                    break;
                case 90:
                    int c_gNN=Pila_G.size()-1;
                    GN=Pila_G.get(c_gNN);
                    AH="else "+" ¬ "+GN+"end;"+" ¬ ";
                    Pila_G.remove((Pila_G.size()-1));
                    break;
                case 91:
                    AH="";
                    break;
                case 92:
                    AF=AG+AH;
                    break;
                case 93:
                    int c_AI=Pila_AI.size()-ConAI-1;
                    AI=Pila_AI.get(c_AI);
                    AG=AI+AG;
                    ConAI++;
                    break;
                case 94:
                    AG="";
                    break;
                case 95:
                    PQ="write"+"("+BA+CO+JJ+")"+";"+" ¬ ";
                    break;  
                case 96:
                    PQ="";
                    break;       
                case 97:
                    JJ=JP+NXT;
                    break;  
                case 98:
                    JJ="";
                    break;
                case 99:
                    BA=val_nume;
                    break;
                case 100:
                    BA="";
                    break; 
                case 101:
                    CO=",";
                    break;
                case 102:
                    CO="";
                    break;
                case 103:
                    JP=K;
                    break;
                case 104:
                    JP=SIG;
                    break;
                case 105:
                    NXT=","+JP+NXT;                    
                    break;
                case 106:
                    NXT="";
                    break;
                case 107:
                    PR="read("+" ¬S "+KR+");";
                    break;
                case 108:
                    PR="";
                    break;
                case 109:
                    KR=","+AM+val_nume;
                    break;
                case 110:
                    AM="&";
                    break;
                case 111:
                    AM="";
                    break;  
                case 112:
                    System.out.println("No hay accion semantica");
                    PL="No se contempla\n";
                    break;
                case 113:
                    PL="";
                    break;
                default:
                    break;          
            }                                        
    }
        
        public static void Buscar_Siguientes(ArrayList<String[]>I,int num)
        {      
            //System.out.println("Buscar Siguientes::::::::::***************");
            int auxiliar=0;
            int auxi=0;
            int max=0;
            String Dos="";
            String Tres="";
            String aux="";
            String aux_X="";
            String cabeza="";
            String Comparar="";
            String Siguientes="";
            String Siguientes_El="";
            String Posicion_Tabla="";
            int tamano=0;  
		for(int i=0; i<I.size(); i++)
                {
                    aux=I.get(i)[I.get(i).length-1]; 
                    if(I.get(i)[0].equals("ACEPTAR"))
                    {
                        q--;
                    }
                    if(aux.contains("."))
                    {
                        max=num;
                        for(int j=0;j<I.get(i).length-1;j++)
                        {
                            aux_X+=I.get(i)[j]+" ";
                        }
                        //System.out.println("Aux_X:"+aux_X);
                        tamano=aux_X.length();
                        aux_X=aux_X.substring(0, tamano-1);
                        //System.out.println("Aux_X:::"+aux_X+"--");
                        
                        StringTokenizer stsa = new StringTokenizer(aux_X);
                        String[] strin = new String[stsa.countTokens()];
                        int ffa = 0;
                        while (stsa.hasMoreTokens()) {
                            strin[ffa] = new String(stsa.nextToken()); 
                            ffa++;
                        }
                        
                        if(ffa == 1)
                        {
                            aux_X += " "+"epsilon";
                        }
                        
                        for(int x=0;x<Lista_Reglas_X.length;x++)
                        {
                            Comparar=Lista_Reglas_X[x];
                            //System.out.println("aux_XXXXXXX::"+aux_X+"----");
                            //System.out.println("Lista de Ragla:"+Comparar+"=");
                            if(aux_X.equals(Comparar.substring(0, Comparar.length()-1)))
                            {
                                //System.out.println("Entro");
                                //hacer token para cabeza  
                                StringTokenizer sts = new StringTokenizer(aux_X);
                                String[] stri = new String[sts.countTokens()];
                                int ff = 0;
                                while (sts.hasMoreTokens()) {
                                    stri[ff] = new String(sts.nextToken()); 
                                    if(ff == 0)
                                    {
                                        cabeza = stri[ff];
                                    }
                                    ff++;
                                }                                        
                                //cabeza = aux_X.substring(0, 1);
                                for(int ii=0;ii<Lista_Bus_Siguientes_X.length;ii++)
                                {
                                    //hacer token para Siguientes
                                    Dos="";
                                    int bban=0;
                                    int res=0;
                                    Siguientes=Lista_Bus_Siguientes_X[ii].toString();
                                    for(int z=0;z<Siguientes.length();z++)
                                    {
                                        char c = Siguientes.charAt(z);                                        
                                        if(c == '(')
                                        {
                                            bban = 1;
                                            res += 1;
                                            if(res > 1)
                                            {
                                                break;
                                            }
                                        }
                                        if(c == ')')
                                        {
                                            bban = 0;
                                        }
                                        if(bban == 1)
                                        {
                                            //System.out.println("Caracter Siguientes:"+c);
                                            Dos += c;
                                        }
                                        
                                    }
                                    Siguientes = Dos.substring(1, Dos.length());
                                    //Siguientes=Lista_Bus_Siguientes_X[ii].substring(2, 3);
                                    //System.out.println("Siguientesss::::::...:::"+Siguientes+"--Cabeza:"+cabeza+"---");
                                    if(Siguientes.equals(cabeza))
                                    {
                                        //hacer token para Siguientes_El
                                        Tres="";
                                        int bbaan=0;
                                        int con=0;
                                        Siguientes_El=Lista_Bus_Siguientes_X[ii].toString();
                                        for(int z=0;z<Siguientes_El.length();z++)
                                        {
                                            char c = Siguientes_El.charAt(z);
                                            if(c == '{')
                                            {
                                                bbaan = 1;
                                            }
                                            if(c == '}')
                                            {
                                                con += 1;
                                                if(con == 2)
                                                {
                                                    bbaan = 0;
                                                }
                                            }
                                            if(bbaan == 1)
                                            {
                                                //System.out.println("Caracter:"+c);
                                                Tres += c;
                                            }                                            
                                        }
                                        Siguientes_El=Tres.substring(1, Tres.length());
                                        //Siguientes_El=Lista_Bus_Siguientes_X[ii].substring(6, Lista_Bus_Siguientes_X[ii].length()-2);
                                        //System.out.println("Siguientes Lista Elemento:"+Siguientes_El);
                                        StringTokenizer sta = new StringTokenizer(Siguientes_El);
                                        String[] stringTmp = new String[sta.countTokens()];
                                        int f = 0;
                                        while (sta.hasMoreTokens()) {
                                            stringTmp[f] = new String(sta.nextToken()); 
                                            //System.out.println("Siguientes Lista Elemento Array::::"+stringTmp[f]);
                                            f++;
                                        }
                                        
                                        for(int g=0;g<stringTmp.length;g++)
                                        {
                                            for(int h=0;h<SubTitulos.length;h++)
                                            {
                                                //System.out.println("stringTmp:"+stringTmp[g]+"------Subtitulos:"+SubTitulos[h]+"---");
                                                if(stringTmp[g].equals(SubTitulos[h]))
                                                {
                                                    //System.out.println("Estado Ubicacion:"+I_Num.get(x).substring(2, I_Num.get(x).length()));
                                                    //Posicion_Tabla =I_Num.get(num).substring(2, I_Num.get(num).length());
                                                    //auxiliar = Integer.parseInt(Posicion_Tabla);;
                                                    auxi=x+1;
                                                    //System.out.println("columna: "+q+" fila: "+h);
                                                    InformacionTab[q][h]="r"+auxi;
                                                    //System.out.println("Reduccion:"+"r"+auxi);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
		}                 
	}
	
	public static int Verificar_Conjunto(ArrayList< ArrayList<String[]> > CC,ArrayList<String[]> I){
		boolean eq = false; 
		int i;
		for( i=0; i<CC.size(); i++){
			eq = VecEquals(CC.get(i),I);
			if(eq) {
				System.out.print("\nTransicion Repetida\n");
				return i;
			}
		}
	
		return -1;
	}
	
	private static boolean VecEquals(ArrayList<String[]> AL, ArrayList<String[]> I) {
		// TODO Auto-generated method stub
		boolean eq = false;
		if(AL.size()==I.size()){
			for(int i=0; i<AL.size();i++){
				eq = STR_Equals(AL.get(i),I.get(i));
				if(!eq){
					
					break;
				}
			}
		}
		return eq;
	}

	private static boolean STR_Equals(String[] s1, String[] s2) {
		// TODO Auto-generated method stub
		if(s1.length==s2.length){
			for(int i=0; i<s1.length;i++){
				if(!s1[i].equals(s2[i])){ 
					return false;
				}else{
					
				}
			}
			return true;			
		}
		return false;
	}

	public static ArrayList<String[]> Ir_a(ArrayList<String[]> ori, String item){
		ArrayList<String[]> I = new ArrayList<String[]>();
		
		int i=0,j=0;
		
		while(true){
			for(j=0;  i<ori.size() && j<ori.get(i).length; j++){ //buscar en el String[] el punto
				if(ori.get(i)[j].equals(".") && j<ori.get(i).length-1){
					if(ori.get(i)[j+1].equals(item)){
						I.add(nuevoSV(ori.get(i)));
						ori.remove(i);
						
						String aux = new String(I.get(I.size()-1)[j+1]);
						I.get(I.size()-1)[j+1]=I.get(I.size()-1)[j];
						I.get(I.size()-1)[j]=aux;
						j=0;
						
						break;
					}else{
						i++;
						break;
					}
				}else if(ori.get(i)[j].equals(".") && j==ori.get(i).length-1){
					j=ori.get(i).length+5;
					i=ori.size()+5;
					break;
				}
			}
			if(i>=ori.size()){break;}
		}
		
		//System.out.print("ce({");
		Impresion_I(I);
		//System.out.print("}) = ");
		Impresion_I(ce(I));
		return nuevoAL(ce(I));
	}

	public static ArrayList<String[]> ce(ArrayList<String[]> t){
		ArrayList<String[]> term = nuevoAL(t);
		
		for(int i=0; i<term.size(); i++){
			for(int j=0; j<term.get(i).length; j++){
				if(term.get(i)[j].equals(".") && j<term.get(i).length-1){
					if(No_Terminal(term.get(i)[j+1],reglas.get(1)) && !term.get(i)[j+1].equals(term.get(i)[0])){
						term.addAll(Add_New_Items(term.get(i)[j+1]));
					}else if(No_Terminal(term.get(i)[j+1],reglas.get(1)) && j!=1){
						term.addAll(Add_New_Items(term.get(i)[j+1]));
					}
				}
			}
		}
		return term;
	}
	
	public static ArrayList<String[]> Add_New_Items(String item){
		ArrayList<String[]> conj = new ArrayList<String[]>(1);
		for (int i=3; i<reglas.size(); i++){
			if(reglas.get(i)[0].equals(item)){
				String[] tmp = {reglas.get(i)[0],"."};
				for(int j=1; j<reglas.get(i).length;j++){
					if(!reglas.get(i)[j].equals("epsilon")){
					//	System.out.println("SI ENTRO :v");
						tmp = Arrays.copyOf(tmp, tmp.length + 1);
						tmp[tmp.length-1]= new String(reglas.get(i)[j]);
					}
				}
				conj.add(tmp);
			}
		}
		return conj;
	}
	
	public static ArrayList<String[]> Leer_Gramatica(String ARCH, String Accion_Se)
        {
            System.out.println("Leer Grmatica-------------------------------------");
		final ArrayList<String[]> reglas = new ArrayList<String[]>();
                Lista_Reglas = new String[150];
                //Lista_Bus_Siguientes = new String[15]; 
                
                
                String[] tokensX = new String[900];
                
                int j=0;
                int auxa=0;
                int auxa_X=0;
                int bandera=0;
                int ii=0;
		try{
			BufferedReader bf = new BufferedReader(new FileReader(ARCH));
			String bfread;
			while((bfread = bf.readLine())!= null){//haz el ciclo mientras haya datos  
                            Lista_Auxiliar="";
                            StringTokenizer st = new StringTokenizer(bfread);
                            String[] stringTmp = new String[st.countTokens()];
                            int i = 0;
			    while (st.hasMoreTokens()) {
			        stringTmp[i] = new String(st.nextToken());
                                Lista_Auxiliar+=stringTmp[i]+" ";
                                if(j == 0 && stringTmp[0].equals("E"))
                                {
                                    Box02 = 0;
                                }
                                if(j == 0 && stringTmp[0].equals("S"))
                                {
                                    Box02 = 1;
                                }
                                if(j == 0 && stringTmp[0].equals("N"))
                                {
                                    Box02 = 2;
                                }
                                if(j == 0 && stringTmp[0].equals("A"))
                                {
                                    Box02 = 3;
                                }
                                if(j == 1)
                                {
                                    Primero+=stringTmp[i]+" ";
                                    Primero_X += stringTmp[i]; 
                                } 
                                if(j == 2)
                                {
                                    Segundo+=stringTmp[i]+" ";
                                }
                                /*if(bandera == 2)
                                {
                                    tokensX[i]= stringTmp[i];
                                    ii++;
                                }*/
                                
			        i++;
			    }                            
			    if(bandera == 0)
                            {
                                reglas.add(stringTmp);
                            }
                            if(j >= 3 && bandera == 0)
                            {
                                Lista_Reglas[auxa]=Lista_Auxiliar;
                                auxa++;
                            }                           
                            j++;
			}
                        ListaTitulo=Segundo+Primero;
                        //System.out.println("Lista de Titulo:::::::-----"+ListaTitulo);
                        
                        //System.out.println("PASO"+"Accion Semantica:"+Accion_Se+"<<<---"+ARCH);
                        String camara = LexicalAnalyser.Tira_Token;   //---------------------------------------------------Aqui se llama la tira de Tokens
                        StringTokenizer stta = new StringTokenizer(camara);
                        String[] strin = new String[stta.countTokens()];
                        int i = 0;
                        ii=0;
			while (stta.hasMoreTokens())
                        {
                            strin[i] = new String(stta.nextToken());
                            //System.out.println("Tokens-----<<<<<<<<<<<:"+strin[i]);
                            tokensX[i]= strin[i];
                            i++;
                            ii++;
                        }
                        tokens = new String[ii];
                        
                        for(int c=0;c<ii;c++)
                        {
                            tokens[c]=tokensX[c];
                            //System.out.println("Tokens---------->>>>:"+tokens[c]);
                        }
                        Lista_Reglas_X = new String[auxa];
                        for(int iw=0;iw<auxa;iw++)
                        {
                            Lista_Reglas_X[iw]=Lista_Reglas[iw];
                        }
                        
                        Lista_Bus_Siguientes_X = new String[ObtenerPS.size];
                        Lista_Bus_Siguientes_X = ObtenerPS.Lista_Bus;
                        /*for(int i = 0;i<ObtenerPS.size;i++)
                        {
                            System.out.println("Siguientes::::----____----::::::"+Lista_Bus_Siguientes_X[i]);
                        }*/
                        
                        StringTokenizer aux = new StringTokenizer(ListaTitulo);
                        SubTitulos = new String[aux.countTokens()+1];
                        SubTitulos[0]="Estados";
                        int f=1;
                        while(aux.hasMoreTokens())
                        {
                            SubTitulos[f] = new String(aux.nextToken());                                                        
                            f++;                            
                        }
                        for(int iq = 0; iq<SubTitulos.length;iq++)
                        {
                            if(SubTitulos[iq].contains("epsilon"))
                            {
                                SubTitulos[iq]="$";
                            }
                        }
                        
                        Lista_Accion_Semantica = new String[auxa];
                        String Auxiliar_Acc="";
                        int cont_R=0;
                        int band_Acc=0;
                        
                        BufferedReader bfsa = new BufferedReader(new FileReader(Accion_Se));
			String bfreadings="";
                        //System.out.println("PASO"+"Accion Semantica:"+Accion_Se+"<<<---");
                        
                        while((bfreadings = bfsa.readLine())!= null){
                            StringTokenizer sta = new StringTokenizer(bfreadings);
                            String[] stringTmp = new String[sta.countTokens()];
                            int ix = 0;                            
                            
			    while (sta.hasMoreTokens()) {                                
			        stringTmp[ix] = new String(sta.nextToken());
                                if(stringTmp[ix].equals("{"))
                                {
                                    band_Acc=1;                                    
                                }   
                                if(band_Acc == 1)
                                {
                                    Auxiliar_Acc += stringTmp[ix]+" ";
                                }
                                if(stringTmp[ix].equals("}"))
                                {
                                    //System.out.println("<<<---"+Auxiliar_Acc+":::::::::::::____________:::::::::::::::");
                                    Lista_Accion_Semantica[cont_R] = Auxiliar_Acc;
                                    //System.out.println("Lista_Accion_Semantica: "+Lista_Accion_Semantica[cont_R]);
                                    Auxiliar_Acc = "";
                                    band_Acc=0;
                                    //System.out.println("Cont_R:"+cont_R);
                                    cont_R++;
                                }
                            }
                        }
                        
			bf.close();
		}catch(Exception e){
			System.err.println("No se encontro el archivo en LeerGrmatica.");
		}		
		return reglas;
	}
	
	public static boolean Es_Terminal(String s,String[] terminales){
		for(int i=0; i<terminales.length; i++){
			if(s.equals(terminales[i])){
				return true;
			}
		}
		return false;
	}
	public static boolean No_Terminal(String s,String[] terminales){
		
		for(int i=0; i<terminales.length; i++){
			if(s.equals(terminales[i])){
				return true;
			}
		}
		return false;
	}
	
	public static void printRules(ArrayList<String[]> rules){
		for (int i=0; i<rules.size(); i++){
			for (int j=0; j<rules.get(i).length; j++)
				System.out.print(rules.get(i)[j]+" ");
			System.out.print("\n");
		}
	}
	public static void Imp_String_Vectorial(String[] v){
		for(int i=0; i<v.length; i++)
			System.out.print(v[i]+" ");
		System.out.print(" ");
	}
	
	public static void Escribir_Archivo(ArrayList<ArrayList<String[]>> c, int l, ArrayList<String>iras,String Cad_Acep)
        {
		File f = new File("Salida.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
                int k=1;
                
                InformacionTab =  new String[I_Num.size()][SubTitulos.length];
                String I_N="";
                String I_E="";
                String I_Aux="";
                String lista_numerica="1 2 3 4 5 6 7 8 9 0";
                int columnas=0;
                
            try
            {
        	fw = new FileWriter(f);
        	bw = new BufferedWriter (fw);
        	pw = new PrintWriter(bw);
        	
           	pw.println(l+"\n");
           	for(int i=0; i<iras.size();i++) 
                {
                    pw.println(iras.get(i));
                    Datos[k][1]=iras.get(i);
                    //System.out.println("Subcadena de 8 a 9:--<<<<--->>>>----"+iras.get(i));
                    I_Aux = iras.get(i).substring(8, 9);
                    String auxa="";
                    auxa = iras.get(i).substring(9, 10);
                    //System.out.println("Subcadena de 8 a 9:--<<<<--->>>>----"+I_Aux);
                    if(lista_numerica.contains(auxa))
                    {
                        I_N = iras.get(i).substring(7, 10);
                        I_E = iras.get(i).substring(11, iras.get(i).length()-1);
                    }
                    else if(lista_numerica.contains(I_Aux))
                    {
                        I_N = iras.get(i).substring(7, 9);
                        I_E = iras.get(i).substring(10, iras.get(i).length()-1);
                    }
                    else
                    {
                        I_N = iras.get(i).substring(7, 8);
                        I_E = iras.get(i).substring(9, iras.get(i).length()-1);
                    }                    
                    //System.out.println("I_N:"+I_N+"   I_E:"+I_E);
                    //System.out.println("AQUI.....ZZZZZZZZ"+"tamaño:"+SubTitulos.length);
                    for(int z=0;z<SubTitulos.length;z++)
                    {                        
                        if(I_E.equals(SubTitulos[z]) && I_E != "$")
                        {                            
                            columnas = Integer.parseInt(I_N);
                            //System.out.println("Primero:::::::::::::::::::::"+Primero+"I_E::::"+I_E);
                            if(Primero.contains(I_E))
                            {
                                InformacionTab[columnas][z]=" "+I_Num.get(i+1).substring(2, I_Num.get(i+1).length());
                            }
                            else
                            {
                                InformacionTab[columnas][z]="d"+I_Num.get(i+1).substring(2, I_Num.get(i+1).length());
                                //System.out.println("Direccion:"+"d"+I_Num.get(i+1).substring(2, I_Num.get(i+1).length()));
                            }
                            if(i<I_N_)
                            {
                                InformacionTab[i][0]=Integer.toString(i);
                            }
                        }
                        if(I_E.contains(SubTitulos[z]) && I_E.contains("$"))
                        {
                            columnas = Integer.parseInt(I_N);
                            InformacionTab[columnas][z]="Aceptar";
                        }
                    }
                    
                    if(i<CC.size())
                    {            
                        Buscar_Siguientes(CC.get(i),i);
                        q++;                        
                    }
                    k++;
                }
           	for(int i=0,j=0; i<I_Num.size(); i++)
                {
                    pw.println(I_Num.get(i));
                    Datos[i][0]=I_Num.get(i);
                }
           	for(int i=0,j=0; i<Conjuntos.size(); i++)
                {
                    pw.println(Conjuntos.get(i));
                    Datos[i][2]=Conjuntos.get(i);                                       
                }
           	
           	for(int i=0; i<iras.size();) 
                    iras.remove(0);
           	for(int i=0,j=0; i<I_Num.size();)
                    I_Num.remove(0);
           	for(int i=0,j=0; i<Conjuntos.size();)
                    Conjuntos.remove(0);
           	
           	pw.close();
           	bw.close(); 
           	fw.close();
           	
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
