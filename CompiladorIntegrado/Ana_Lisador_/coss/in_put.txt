
//a ver si lo hace



int main(){
int i, suma=0;
printf("Teclea num:");
scanf("%d",&num);
if(num>0)
	num=num*2.4;
else
	num=num-2;
i=0;
while(i<=4){
	suma=suma+i;
	i++;
}
for(i=0;i<=4;i++){
	for(j=0;j<=2;j++)
		if(i!=0)
			suma=suma+i+j;
}
suma=0;
i=0;
do{
	suma=suma+i;
	i++;
}while(i<=4);
printf("Posicion que quieres conocer su valor[0-1]:");
scanf("%d",&i);
switch(i){
		case 0 : printf("%d",suma);
				break;
		case 1 : printf("%d",suma+i);
				break;
		default : printf("opción no valida\n");
	}
return 0;
}