package UnderstandingObjectComposition;

  public class CustomerRunner {
        public static void main(String[] args) {
            //Customer customer = new Customer();
            Address homeAddress = new Address("Flat No. 51", "Hiranandani Gardens", "Mumbai", "400076");
            Customer customer = new Customer("John");
            Address workAddress = new Address("Flat No. 51", "Subham", "Kolkata", "700001");
            customer.setWorkAddress(workAddress);
            System.out.println(customer);
        }
    }
