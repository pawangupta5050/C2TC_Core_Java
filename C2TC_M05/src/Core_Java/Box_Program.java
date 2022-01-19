package Core_Java;

	class Box
	{
		float width;
		float height;
		float depth;
		 float calcVol(){
			 return width*height*depth;
		 }
	}

	public class Box_Program {

		public static void main(String[] args) {
			Box box1=new Box();
			box1.width=3.4f;
			box1.height=2.2f;
			box1.depth=1.4f;
			float vol=box1.calcVol();
			System.out.println("Volume of Box1 is"+vol);
			
			Box box2=new Box();
			box2.width=3.1f;
			box2.height=2.5f;
			box2.depth=5.1f;
			float vol2=box2.calcVol();
			System.out.println("Volume of Box2 is"+vol2);
			

		}

	}

