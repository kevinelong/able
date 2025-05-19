
//The -able suffix.
// recycable - recycle()
// edible - eat()
// flippable - flip()

//todo items are DoAble
interface IDoable{
    public void done();
}

interface IFlappable{
    public void flap();
}

class Task implements IDoable, IFlappable {

    @Override
    public void done() {
        System.out.println("Its marked as complete!!!");
    }

    @Override
    public void flap() {
        System.out.println("Whoosh whoosh!!!");
    }
}

class BigTask extends Task{
    public void done() {
        System.out.println("Its marked as complete!!! Whooo!!!");
    }
}

class Main{

    public static void main(String[] args) {
        BigTask t = new BigTask();
        t.done();
        t.flap();
    }
}
