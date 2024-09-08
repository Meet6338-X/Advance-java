interface Age {
    int x = 21;

    void getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
class innerclass implements Age {
    public void getAge() {
        System.out.print("Age is " + x);
    }
}

// Class 2 Main class AnonymousDemo
class JavaApplication4 {
    // Main driver method
    public static void main(String[] args) {
        innerclass obj = new innerclass();
        obj.getAge();
    }
}
