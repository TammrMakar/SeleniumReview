package Replit;

class AnotherClass{
    private void privateMethod(){
        System.out.println("private");
    }

    void defaultMethod() {
        System.out.println("default");
    }

    protected void protectedMethod() {
        System.out.println("protected");
    }

    public void publicMethod() {
        System.out.println("public");
    }
}

class Main {
    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        ac.defaultMethod();
        ac.protectedMethod();
        ac.publicMethod();
    }
}

