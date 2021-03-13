package pack;

class main
{
	static ColorImage reduzir(ColorImage c, int n){//reduzir uma imagem se o fator de escala dado como argumento 
	    //for dois, cada quadrado de lado dois na imagem original da origem a um ´unico pixel na 
	    //imagem reduzida. A cor do pixel na imagem comprimida devera corresponder a media 
	    //das cores dos pixeis do respetivo quadrado da imagem original
	        ColorImage d= new ColorImage(c.getWidth()/n ,c.getHeight()/n);
	        int cont=0;
	        int r=0;
	        int g=0;
	        int b=0;
	        int x=0;
	        int y=0;
	        for(int i=0;i<c.getWidth()-n;i+=n){//saltar de n em n para ter a media das cores dos blocos.
	            for(int j=0;j<c.getHeight()-n;j+=n){
	                for(int u=0;u<n;u++){
	                    for(int f=0;f<n;f++){
	                        Color o=c.getColor(i+u,j+f);
	                        r+=o.getR();
	                        g+=o.getG();
	                        b+=o.getB();
	                        cont++;
	                    }
	                }

	                Color q=new Color(r/(cont),g/(cont),b/(cont));
                    d.setColor(x,y,q);
                    r=0;
                    g=0;
                    b=0;
                    cont=0;

	                y++;
	            }

	            x++;
	            y = 0;
	        }
	        return d;
	    }
	
	
	static void main()
	{
		ColorImage img = new ColorImage("objc1.png");
		
		ColorImage d = reduzir(img, 2);
	}


}