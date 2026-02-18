interface CanFight{
	void fight();
}

interface CanFly{
	void fly();
}

interface CanSwim{
	 void swim();
}

// Concrete 
class ActionHero implements CanFight{
	 @Override
	 public void fight(){
	 	System.out.println("Fight");
	 }
}

class Hero extends ActionHero implements CanFly,CanSwim,CanFight{
	@Override
	public void fly(){
		System.out.println("Fly");
	}

	@Override
	public void swim(){
		System.out.println("swim");	
	}

} 


class App{
	public static void main(String[] args) {
		
		CanFight ft=new Hero();
		CanSwim sm=new Hero();
		CanFly sf=new Hero();

	}
}