import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class bot extends JFrame{
    public bot(){
        private JTextArea chatArea= new JTextArea();
        private JTextField chatbox= new JTextField();
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(Exit_ON_Close);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("ChatBOT");
        frame.add(chatArea);
        frame.add(chatbox);
        
        //FOR TEXT_AREA
        chatArea.setSize(500 , 400);
        chatArea.setLocation(5, 5);

        //FOR TEXT_FIELD
        chatbox.setSize(540, 30);
        chatbox.setLocation(5, 500);

        chatbox.addActionListner(new ActionListner(){

            @Override
            public void actionPerformed(ActionEvent arg0){
                String gtext = chatbox. getText().toLowerCase();
                chatArea.append("YOU->"+ gtext + "\n");
                chatbox.setText(" ");

                if(gtext.contains("Hi"){
                    bot("Hello!");
                })
                else {
                    int rand = (int) (Math.random() *3+1);
                    if(rand== 1){
                        bot("I Dont Understand You :( ");
                    }
                    else{
                        if(rand==2){
                            bot("I Dont Understand You :( ");
                        }
                        else{
                            if(rand==1){
                                bot("Please Come Again... ");
                            }
                    }
                    
                }
            }
        })
    }
    private void bot(String string){
        chatArea.append("BOT->"+ string + "\n");
    }
    public static void public static void main(String[] args) {
        
    }
}
