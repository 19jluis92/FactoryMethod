package FactoryMethod2;

public class Main {
	 public static void main(String[] args)
	    {
	         IArchivo video = Creador.getArchivo( Creador.VIDEO );
	        video.reproducir();
	         IArchivo audio = Creador.getArchivo( Creador.AUDIO );
	        audio.reproducir();
	    }
}
