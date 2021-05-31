import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.math.BigInteger; 
import javax.swing.*; 
 
public class CalculateFactorial { 
         private JFrame frame;     
         private JButton button;     
         private JLabel result;     
         private JTextField field;     
         private JLabel header; 
         public CalculateFactorial() {         
             frame = new JFrame();         
             button = new JButton("Calculate");         
             header = new JLabel("Factorial Calculator");         
             field = new JTextField();         
             result = new JLabel(); 
         
        frame.setLayout(null); 
         
        header.setBounds(200, 10, 150, 50);         
        field.setBounds(175, 100, 150, 50);         
        button.setBounds(200, 300, 100, 50);         
        result.setBounds(10, 200, 500, 50); 
         
        button.addActionListener(new ActionListener() { 
            @Override 
            public void actionPerformed(ActionEvent e) { 
                String num = field.getText().trim(); 
                System.out.println(num);                 
                if(num.length() == 0) { 
                    result.setText("Result: NaN"); 
                } else { 
                    String fact = calculateFactorial(num);                     
                    System.out.println(fact);                     
                    result.setText("Result: " + fact); 
                } 
            } 
        });          
        frame.add(header);         
        frame.add(field);         
        frame.add(result);         
        frame.add(button);         
        frame.setSize(500, 500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
     
    public void show() {         
        frame.setVisible(true); 
    }      
    static String calculateFactorial(String num) { 
        long n = Long.parseLong(num);         
        BigInteger fact = BigInteger.ONE;        
         while(n > 1) 
            fact = fact.multiply(BigInteger.valueOf(n--));         
            return fact.toString(); 
    }      
    public static void main(String[] args) { 
        CalculateFactorial obj = new CalculateFactorial();         
        obj.show(); 
    } 
}