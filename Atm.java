import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atm implements ActionListener {
    JFrame Languageframe;
    JFrame Firstpasswordframe;
    JFrame Mainframe;
    JFrame Changepasswordframe;
    JFrame InventoryAnnouncementframe;
    JFrame CashWithdrawalframe;
    JFrame CardByCardframe;
    JFrame Successframe;
    JButton PersianButton;
    JButton EnglishButton;
    JButton SubmitButtonForChangePassword;
    JButton SubmitButtonForCardBeCard;
    JButton SubmitButtomForFirstPage;
    JButton ChangePasswordButton;
    JButton InventoryAnnouncementButton;
    JButton CashWithdrawalButton;
    JButton CardByCardbutton;
    JButton MablaghAvalbardasht;
    JButton MablaghDovombardasht;
    JButton MablaghSevombardasht;
    JButton MablaghCharombardasht;
    JPanel LanguagePanel;
    JPanel FirstpasswordPanel;
    JPanel MainPanel;
    JPanel ChangepasswordPanel;
    JPanel InventoryAnnouncementPanel;
    JPanel CashWithdrawalPanel;
    JPanel CardByCardPanel;
    JPanel Successpanel;
    JLabel SuccessLabel;
    JLabel ChoseLanguagePersianLabel;
    JLabel ChoseLanguageEnglishLabel;
    JLabel SubmitPasswordLabel;
    JLabel NewPasswordLabel;
    JLabel InventoryAnnouncementLabel;
    JLabel  MablaghMorednazaCardBeCardLabel;
    JLabel ShomareCardMaghsadLabel;
    JTextField PasswordTextField;
    JTextField ChangePasswordTextField;
    JTextField MablaghmorednazarTextField;
    JTextField ShomareCardMaghsadTextField;

    Atm(){
        //صفحه تعیین زبان
        Languageframe = new JFrame("ATM");
        Languageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Languageframe.setSize(800,650);

        ChoseLanguageEnglishLabel = new JLabel("Choose Languge");
        ChoseLanguagePersianLabel = new JLabel("زبان خود را انتخاب کنید");
        ChoseLanguageEnglishLabel.setFont(new Font(null,Font.PLAIN,20));
        ChoseLanguagePersianLabel.setFont(new Font(null,Font.PLAIN,20));
        ChoseLanguageEnglishLabel.setBounds(200,225,200,200);
        ChoseLanguagePersianLabel.setBounds(400,225,200,200);

        PersianButton = new JButton("فارسی");
        PersianButton.addActionListener(this);
        EnglishButton = new JButton("English");
        EnglishButton.setBounds(0,300,100,50);
        PersianButton.setBounds(687,300,100,50);
        PersianButton.setFocusable(false);
        EnglishButton.setFocusable(false);

        LanguagePanel = new JPanel();
        LanguagePanel.setLayout(null);
        LanguagePanel.setBackground(Color.CYAN);

        LanguagePanel.add(ChoseLanguagePersianLabel);
        LanguagePanel.add(ChoseLanguageEnglishLabel);
        LanguagePanel.add(EnglishButton);
        LanguagePanel.add(PersianButton);
        Languageframe.add(LanguagePanel);
        Languageframe.setVisible(true);
//------------------------------------------------------------------------------
        //صفحه وارد کردن رمز
        Firstpasswordframe = new JFrame("ATM");
        Firstpasswordframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Firstpasswordframe.setSize(800,650);

        SubmitPasswordLabel = new JLabel("رمز خود را وارد کنید");
        SubmitPasswordLabel.setBounds(330,100,200,200);
        SubmitPasswordLabel.setFont(new Font(null,Font.PLAIN,20));

        PasswordTextField = new JTextField();
        PasswordTextField.setBounds(350,250,100,30);

        SubmitButtomForFirstPage = new JButton("تایید");
        SubmitButtomForFirstPage.setBounds(350,400,100,30);
        SubmitButtomForFirstPage.addActionListener(this);
        SubmitButtomForFirstPage.setFocusable(false);

        FirstpasswordPanel =new JPanel();
        FirstpasswordPanel.setLayout(null);
        FirstpasswordPanel.setBackground(Color.CYAN);

        FirstpasswordPanel.add(SubmitPasswordLabel);
        FirstpasswordPanel.add(SubmitButtomForFirstPage);
        Firstpasswordframe.add(PasswordTextField);
        Firstpasswordframe.add(FirstpasswordPanel);
        Firstpasswordframe.setVisible(false);
//------------------------------------------------
//صفحه عملیات
        Mainframe = new JFrame("ATM");
        Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mainframe.setSize(800,650);

        ChangePasswordButton = new JButton("تغییر رمز");
        ChangePasswordButton.addActionListener(this);
        ChangePasswordButton.setBounds(685,150,100,30);
        ChangePasswordButton.setFocusable(false);

        InventoryAnnouncementButton = new JButton("اعلام موجودی");
        InventoryAnnouncementButton.addActionListener(this);
        InventoryAnnouncementButton.setBounds(685,300,100,30);
        InventoryAnnouncementButton.setFocusable(false);

        CashWithdrawalButton = new JButton("برداشت وجه");
        CashWithdrawalButton.addActionListener(this);
        CashWithdrawalButton.setBounds(0,150,100,30);
        CashWithdrawalButton.setFocusable(false);

        CardByCardbutton = new JButton("کارت  به کارت");
        CardByCardbutton.addActionListener(this);
        CardByCardbutton.setBounds(0,300,100,30);
        CardByCardbutton.setFocusable(false);

        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(Color.CYAN);

        MainPanel.add(ChangePasswordButton);
        MainPanel.add(InventoryAnnouncementButton);
        MainPanel.add(CashWithdrawalButton);
        MainPanel.add(CardByCardbutton);
        Mainframe.add(MainPanel);
        Mainframe.setVisible(false);
//---------------------------------------------------------------
        //صفحه تغییر رمز
        Changepasswordframe = new JFrame("ATM");
        Changepasswordframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Changepasswordframe.setSize(800,650);

        NewPasswordLabel = new JLabel("رمز جدید را وارد کنید");
        NewPasswordLabel.setBounds(330,100,200,200);
        NewPasswordLabel.setFont(new Font(null,Font.PLAIN,20));

        ChangePasswordTextField = new JTextField();
        ChangePasswordTextField.setBounds(350,250,100,30);

        SubmitButtonForChangePassword = new JButton("تایید");
        SubmitButtonForChangePassword.setBounds(350,400,100,30);
        SubmitButtonForChangePassword.addActionListener(this);
        SubmitButtonForChangePassword.setFocusable(false);

        ChangepasswordPanel =new JPanel();
        ChangepasswordPanel.setLayout(null);
        ChangepasswordPanel.setBackground(Color.CYAN);

        ChangepasswordPanel.add(NewPasswordLabel);
        ChangepasswordPanel.add(ChangePasswordTextField);
        ChangepasswordPanel.add(SubmitButtonForChangePassword);
        Changepasswordframe.add(ChangepasswordPanel);
        Changepasswordframe.setVisible(false);
//----------------------------------------------------------------
        //صفحه موجودی حساب
        InventoryAnnouncementframe = new JFrame("ATM");
        InventoryAnnouncementframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InventoryAnnouncementframe.setSize(800,650);

        InventoryAnnouncementLabel = new JLabel("موجودی حساب شما: 56350000 ریال");
        InventoryAnnouncementLabel.setBounds(270,30,500,500);
        InventoryAnnouncementLabel.setFont(new Font(null,Font.PLAIN,20));

        InventoryAnnouncementPanel = new JPanel();
        InventoryAnnouncementPanel.setLayout(null);
        InventoryAnnouncementPanel.setBackground(Color.CYAN);

        InventoryAnnouncementPanel.add(InventoryAnnouncementLabel);
        InventoryAnnouncementframe.add(InventoryAnnouncementPanel);
        InventoryAnnouncementframe.setVisible(false);
//--------------------------------------------------------------
        //صفحه برداشت وجه
        CashWithdrawalframe = new JFrame("ATM");
        CashWithdrawalframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CashWithdrawalframe.setSize(800,650);

        MablaghSevombardasht= new JButton("1500000");
        MablaghSevombardasht.setBounds(685,150,100,30);
        MablaghSevombardasht.addActionListener(this);
        MablaghSevombardasht.setFocusable(false);

        MablaghCharombardasht = new JButton("2000000 ");
        MablaghCharombardasht.setBounds(685,300,100,30);
        MablaghCharombardasht.addActionListener(this);
        MablaghCharombardasht.setFocusable(false);

        MablaghAvalbardasht = new JButton("500000");
        MablaghAvalbardasht.setBounds(0,150,100,30);
        MablaghAvalbardasht.addActionListener(this);
        MablaghAvalbardasht.setFocusable(false);

        MablaghDovombardasht = new JButton("1000000");
        MablaghDovombardasht.setBounds(0,300,100,30);
        MablaghDovombardasht.addActionListener(this);
        MablaghDovombardasht.setFocusable(false);

        CashWithdrawalPanel = new JPanel();
        CashWithdrawalPanel.setLayout(null);
        CashWithdrawalPanel.setBackground(Color.CYAN);

        CashWithdrawalPanel.add(MablaghAvalbardasht);
        CashWithdrawalPanel.add(MablaghDovombardasht);
        CashWithdrawalPanel.add(MablaghSevombardasht);
        CashWithdrawalPanel.add(MablaghCharombardasht);
        CashWithdrawalframe.add(CashWithdrawalPanel);
        CashWithdrawalframe.setVisible(false);
//----------------------------------------------------------------
        //صفحه کارت به کارت
        CardByCardframe = new JFrame("ATM");
        CardByCardframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CardByCardframe.setSize(800,650);

        MablaghMorednazaCardBeCardLabel =new JLabel("مبلغ مورد نظر را وارد کنید:");
        MablaghMorednazaCardBeCardLabel.setBounds(270,-30,500,500);
        MablaghMorednazaCardBeCardLabel.setFont(new Font(null,Font.PLAIN,20));

        MablaghmorednazarTextField = new JTextField();
        MablaghmorednazarTextField.setBounds(285,250,180,30);

        ShomareCardMaghsadLabel =new JLabel("شماره کارت مقصد را وارد کنید:");
        ShomareCardMaghsadLabel.setBounds(270,70,500,500);
        ShomareCardMaghsadLabel.setFont(new Font(null,Font.PLAIN,20));

        ShomareCardMaghsadTextField = new JTextField();
        ShomareCardMaghsadTextField.setBounds(285,350,180,30);

        SubmitButtonForCardBeCard = new JButton("ثبت");
        SubmitButtonForCardBeCard.setBounds(285,430,180,30);
        SubmitButtonForCardBeCard.addActionListener(this);
        SubmitButtonForCardBeCard.setFocusable(false);

        CardByCardPanel = new JPanel();
        CardByCardPanel.setLayout(null);
        CardByCardPanel.setBackground(Color.CYAN);

        CardByCardPanel.add(MablaghMorednazaCardBeCardLabel);
        CardByCardPanel.add(MablaghmorednazarTextField);
        CardByCardPanel.add(ShomareCardMaghsadLabel);
        CardByCardPanel.add(ShomareCardMaghsadTextField);
        CardByCardPanel.add(SubmitButtonForCardBeCard);
        CardByCardframe.add(CardByCardPanel);
        CardByCardframe.setVisible(false);
//--------------------------------------------------------
        //صفحه عملیات با موفقیت انجام شد
        Successframe = new JFrame("ATM");
        Successframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Successframe.setSize(800,650);

        SuccessLabel = new JLabel("عملیات با موفقیت انجام شد! ");
        SuccessLabel.setBounds(270,30,500,500);
        SuccessLabel.setFont(new Font(null,Font.PLAIN,20));

        Successpanel = new JPanel();
        Successpanel.setLayout(null);
        Successpanel.setBackground(Color.CYAN);

        Successpanel.add(SuccessLabel);
        Successframe.add(Successpanel);
        Successframe.setVisible(false);
//--------------------------------------------------------------------
    }

    public static void main(String[] args) {
        Atm atm = new Atm();

    }
    //اعمال دکمه ها
    @Override
    public void  actionPerformed(ActionEvent e){
        if (e.getSource()==PersianButton){
            Languageframe.dispose();
            Firstpasswordframe.setVisible(true);
        }
        if (e.getSource()==SubmitButtomForFirstPage){
            Firstpasswordframe.dispose();
            Mainframe.setVisible(true);
        }
        if (e.getSource()==ChangePasswordButton){
            Mainframe.dispose();
            Changepasswordframe.setVisible(true);
        }
        if (e.getSource()==InventoryAnnouncementButton){
            Mainframe.dispose();
            InventoryAnnouncementframe.setVisible(true);
        }
        if (e.getSource()==CardByCardbutton){
            Mainframe.dispose();
            CardByCardframe.setVisible(true);
        }
        if (e.getSource()==CashWithdrawalButton){
            Mainframe.dispose();
            CashWithdrawalframe.setVisible(true);
        }
        if (e.getSource()==SubmitButtonForCardBeCard){
            CardByCardframe.dispose();
            Successframe.setVisible(true);
        }
        if (e.getSource()==SubmitButtonForChangePassword){
            Changepasswordframe.dispose();
            Successframe.setVisible(true);
        }
        if (e.getSource()==MablaghAvalbardasht){
            CashWithdrawalframe.dispose();
            Successframe.setVisible(true);
        }
        if (e.getSource()==MablaghDovombardasht){
            CashWithdrawalframe.dispose();
            Successframe.setVisible(true);
        }
        if (e.getSource()==MablaghSevombardasht){
            CashWithdrawalframe.dispose();
            Successframe.setVisible(true);
        }
        if (e.getSource()==MablaghCharombardasht){
            CashWithdrawalframe.dispose();
            Successframe.setVisible(true);
        }
    }
}
