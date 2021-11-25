package homeWork6;

public class Animal {

    private String name;
    private float runLimit;
    private float swimLimit;

    public Animal(String name, float runLimit, float swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void runOn(float requiredDistance) {
        if(requiredDistance > runLimit){
            System.out.println(name + " не может пробежать " + requiredDistance + ", максимум: " + runLimit);
        }
        else {
            System.out.println(name + " пробежала " + requiredDistance);
        }
        System.out.println();
    }
    public void swimOn(float requiredDistance) {
        if(requiredDistance > swimLimit){
            System.out.println(name + " не может проплыть " + requiredDistance + ", максимум " + swimLimit);
        }
        else {
            System.out.println(name + " проплыла " + requiredDistance);
        }
        System.out.println();
    }
}
