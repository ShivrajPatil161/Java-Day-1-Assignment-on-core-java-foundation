class Counter {
    // Static variable shared by all instances
    private static int count = 0;

    // Constructor increments the static count
    public Counter() {
        count++;
    }

    // Static method to get current count
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Create multiple Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Static variable is shared, so it reflects total number of objects created
        System.out.println("Total Counter objects created: " + Counter.getCount());

        // Create another object
        Counter c4 = new Counter();
        System.out.println("Total Counter objects created after creating c4: " + Counter.getCount());
    }
}
