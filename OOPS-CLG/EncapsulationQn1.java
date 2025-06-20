// Encapsulation
class Account {
    
    private long accNo; 
    private String name;
    private String email;
    private float amount;

    public long getAccNo() { return accNo; }
    public void setAccNo(long accNo) { this.accNo = accNo; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public float getAmount() { return amount; }
    public void setAmount(float amount) { this.amount = amount; }
}

public class EncapsulationQn1 {
    public static void main(String[] args)  {
        Account acc = new Account(); 

        acc.setAccNo(90482098491L);
        acc.setName("Amit Kumar");
        acc.setEmail("amit@gmail.com");
        acc.setAmount(100000f);

        System.out.println("Account Number: " + acc.getAccNo());
        System.out.println("Name: " + acc.getName());
        System.out.println("Email: " + acc.getEmail());
        System.out.println("Amount: " + acc.getAmount());
    }
}