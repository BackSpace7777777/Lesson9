package src.Examples;
public class Main {
    public static void main(String[] args) {
        Monster m[]=new Monster[10];
        String mNames[]={"Fred","Frank","Parker","Wolfie","Horice","Jack"};
        for(int i=0;i<mNames.length;i++)
        {
            if(i<3)m[i]=new Zombie(mNames[i]);
            else m[i]=new Vampire(mNames[i]);
        }
        for(int i=0;i<mNames.length;i++)
        {
            System.out.print(m[i].identify() + " says: ");
            m[i].attack();
        }
    }
}
