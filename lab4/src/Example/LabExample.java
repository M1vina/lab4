package Example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    class LabExample extends JFrame
    {
        JTextField jta1 = new JTextField(10);//первое поле для ввода
        JTextField jta2 = new JTextField(10);//второе поле для ввода
        JButton button = new JButton(" Add them up");
        Font fnt = new Font("Times new roman",Font.BOLD,20);
        LabExample()
        {
            super("Example");                                //заголовок
            setLayout(new FlowLayout());                          //Менеджер расположения; определяет, каким образом на форме будут располагаться компоненты.
            setSize(250,150);                        //определение размеров окна
            add(new JLabel("1st Number"));                  //надпись рядом с полем для ввода
            add(jta1);                                          //создание поля для ввода в окне
            add(new JLabel("2nd Number"));                  //надпись рядом с полем для ввода
            add(jta2);                                          //создание 2ого поля для ввода в окне
            add(button);                                        //создание кнопки
            button.addActionListener(new ActionListener()       //в {} то, что выполняется при нажатии кнопки
            {
                public void actionPerformed(ActionEvent ae)
                {
                    try //определяет блок кода, в котором может произойти исключение
                    {
                        double x1 =
                                Double.parseDouble(jta1.getText().trim()); //возвращает значение в строке jta1 и помещает в ппеременную x1
                        double x2 =
                                Double.parseDouble(jta2.getText().trim()); //возвращает значение в строке jta2 и помещает в ппеременную x2

                        JOptionPane.showMessageDialog(null, "Result =" +(x1+x2), "Alert",JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception e) //определяет блок кода, в котором происходит обработка исключения
                    {
                        JOptionPane.showMessageDialog(null, "Error in Numbers !","alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            setVisible(true);
        }
        public static void main(String[]args)
        {
            new LabExample();
        }
    }




class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);

    JTextArea txtArea = new JTextArea(20,20);
    JScrollPane jScroll = new JScrollPane(txtArea);

    JButton button = new JButton("Add some Text");
    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt =  JOptionPane.showInputDialog(null,"Insert some text");

            }
        });
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}




class BorderExample extends JFrame
{
    JPanel[] pnl = new JPanel[12];
    public BorderExample()
    {
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("two"),BorderLayout.EAST);
        pnl[4].add(new JButton("three"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("four"),BorderLayout.NORTH);
        pnl[4].add(new JButton("five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}





class NullLayout extends JFrame
{
    JButton but1 = new JButton("One");;
    JButton but2 = new JButton("two");;
    JButton but3 = new JButton("three");;
    public NullLayout()
    {
        setLayout(null);
        but1.setBounds(150,300,100,20); // added at 150,300 width = 100,height=20
        but2.setSize(80,400); // added at 0,0 width = 80, height=400
        but3.setLocation(300,100);
        but3.setSize(200,75);
// those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }
    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}

class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}


