package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.omg.PortableServer.ServantLocator;

public class subway implements ActionListener 
{
   // 멤버변수
   JFrame f;
   String[] MenuData = {"","","","","","","","","",""};
   boolean[] toppingData = new boolean[20];
   boolean[][] breadSelecting = new boolean[2][3];
   boolean[][] toppingSelecting = new boolean[4][2];
   boolean[][] vesetableSelecting = new boolean[4][5];
   JButton[][] menuClassic ,menuLandF ,menuPremium , breadMenu , toppingMenus , vegetableMenus , sauceMenus ;
   JPanel p1 , p2 , p3 , p4 , p5 , menu , bread , breadMenu1 , breadOption , topping , toppingMenu , toppingOption , vegetable , vegetableMenu , vegetableOption , sauce
                  ,sauceMenu , sauceOption;
   JButton  MenuType1 , MenuType2 , MenuType3 , oneSize , twoSize , okay, breadToMenu ,breadToAddi , toppingToVege , toppingToBread , veseToSauce , veseToAddi
                  ,sauceToVese , orderEnd;
   // 생성자 함수

   subway() 
   {
      sauce = new JPanel();
      sauceMenu = new JPanel();
      sauceOption = new JPanel();
      sauceMenus = new JButton[3][4];
      orderEnd = new JButton("다음");
      sauceToVese = new JButton("이전");
      
     vegetable = new JPanel();
      vegetableMenu = new JPanel();
      vegetableOption = new JPanel();
      vegetableMenus = new JButton[4][5];
      veseToSauce = new JButton("다음");
      veseToAddi = new JButton("이전");

     topping = new JPanel();
      toppingMenu = new JPanel();
      toppingOption = new JPanel();
      toppingMenus = new JButton[4][2];
      toppingToVege = new JButton("다음");
      toppingToBread = new JButton("이전");
      
      bread = new JPanel();
      breadMenu1 = new JPanel();
      breadOption = new JPanel();
      breadToAddi = new JButton("다음");
      breadToMenu = new JButton("이전");
      
      p5 = new JPanel();
      okay = new JButton("확인");
      p5.add(okay);

      MenuType1 = new JButton("Classic");
      MenuType2 = new JButton("dark & Fresh");
      MenuType3 = new JButton("Premium");

      f = new JFrame("메뉴");
      menu = new JPanel();
      menuClassic = new JButton[2][3];
      menuLandF = new JButton[2][3];
      menuPremium = new JButton[2][3];

      MenuType1.addActionListener(this);
      MenuType2.addActionListener(this);
      MenuType3.addActionListener(this);

      p1 = new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
      p4 = new JPanel();

      p4.setLayout(new BorderLayout(10,1));

      p4.add(MenuType1 , BorderLayout.WEST);
      p4.add(MenuType2 , BorderLayout.CENTER);
      p4.add(MenuType3 , BorderLayout.EAST);

      p1.setLayout(new GridLayout(2,3));
      p2.setLayout(new GridLayout(2,3));
      p3.setLayout(new GridLayout(2,3));

      menu.setLayout(new BorderLayout());
      menu.add(p4 , BorderLayout.NORTH);
      menu.add(p5,  BorderLayout.SOUTH);



      for (int i = 0; i < 2; i++)
      {
         for (int j = 0; j < 3; j++) 
         {
            menuClassic[i][j] = new JButton();
            p1.add(menuClassic[i][j]);
            menuClassic[i][j].addActionListener(this);
            menuClassic[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\1.png"));
         }
      }

      for (int i = 0; i < 2; i++)
      {
         for (int j = 0; j < 3; j++) 
         {
            menuLandF[i][j] = new JButton();
            p2.add(menuLandF[i][j]);
            menuLandF[i][j].addActionListener(this);
            menuLandF[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\2.png"));            
         }
      }

      for (int i = 0; i < 2; i++)
      {
         for (int j = 0; j < 3; j++) 
         {
            menuPremium[i][j] = new JButton();
            p3.add(menuPremium[i][j]);
            menuPremium[i][j].addActionListener(this);
            menuPremium[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
         }
      }

      addLayout();
   }

   void addLayout() 
   {
      f.setLayout(new BorderLayout());
      f.add(menu);
      f.setSize(600, 600);
      f.setVisible(true);

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼
   }



   public String[] getMenuData() 
   {
      return MenuData;
   }

   public void actionPerformed(ActionEvent e)
   {
      JButton btn = (JButton) e.getSource();
      if (btn == MenuType1)
      {
         for (int i = 0; i < 2; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
               MenuData[0] = Integer.toString(0);
               menuClassic[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\1.png"));
            }
         }
         menu.remove(p2);
         menu.remove(p3);
         //         
         System.out.println(MenuData);

         menu.add(p1 , BorderLayout.CENTER);

         f.setVisible(false);
         f.add(menu);
         f.setVisible(true);

      }

      else if (btn == MenuType2)
      {
         MenuData[0] = Integer.toString(1);
         for (int i = 0; i < 2; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
               menuLandF[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\2.png"));
            }
         }

         System.out.println(MenuData);
         menu.remove(p3);
         menu.remove(p1);

         menu.add(p2 , BorderLayout.CENTER);
         f.setVisible(false);
         f.add(menu);
         f.setVisible(true);
      }
      
      
      else if (btn == MenuType3)
      {
         MenuData[0] = Integer.toString(2);
         for (int i = 0; i < 2; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
               menuPremium[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
            }
         }

         menu.remove(p2);
         menu.remove(p1);

         menu.add(p3 , BorderLayout.CENTER);
         f.setVisible(false);
         f.add(menu);
         f.setVisible(true);
      }
      else 
      {
         for (int i = 0; i < 2; i++)
         {
            for (int j = 0; j < 3; j++) 
            {
               if (btn == menuClassic[i][j])
               {
                  selectbread();
                  //                  JOptionPane.showMessageDialog(null, "메뉴 선택 완료");
                  MenuData[1] =Integer.toString(3*i + j);
               }

               else if (btn == menuLandF[i][j])
               {
                  selectbread();
                  MenuData[1] =Integer.toString(3*i + j);
               }
               else if (btn == menuPremium[i][j])
               {
                  selectbread();
                  MenuData[1] =Integer.toString(3*i + j);
               }
            }
         }
         
         
         for (int i = 0; i < 2; i++) 
         {
            for (int j = 0; j < 3; j++) 
            {
               if ( btn == breadMenu[i][j])
               {
                  for (int k = 0; k < 2; k++) 
                  {
                     for (int p = 0; p < 3; p++) 
                     {
                        breadSelecting = new boolean[2][3];
                        breadMenu[k][p].setBackground(Color.lightGray);
                     }
                  }

                  System.out.println(breadSelecting[i][j]);
                  MenuData[2] =Integer.toString(3*i + j);
                  System.out.println("빵");
                  breadMenu[i][j].setBackground(Color.darkGray);
                  break;
               }
            }
         }

         
    
         
         for (int i = 0; i < 4; i++) 
         {
            for (int j = 0; j < 2 ; j++) 
            {
               if ( btn == toppingMenus[i][j])
               {
                    for (int k = 0; k < 4; k++) 
                     {
                        for (int p = 0; p < 2; p++) 
                        {
                           toppingSelecting = new boolean[2][3];
                           toppingMenus[k][p].setBackground(Color.lightGray);
                        }
                     }
                  
                  
                  MenuData[3] =Integer.toString(i);
                  MenuData[4] =Integer.toString(j);
                  toppingMenus[i][j].setBackground(Color.darkGray);
                  System.out.println("토핑");
               }
            }
         }

         //         for (int i = 0; i < 4; i++) 
//         {
//            for (int j = 0; j < 2; j++) 
//            {
//
//               if ( btn == toppingMenus[i][j])
//               {
//                  MenuData[5] =Integer.toString(i);
//                  MenuData[6] =Integer.toString(j);
//                  System.out.println("토핑");
//               }
//            }
//         }
//         for (int i = 0; i < 4; i++) 
//         {
//            for (int j = 0; j < 5; j++) 
//            {
//
//               if ( btn == vegetableMenus[i][j])
//               {
//                  MenuData[7] =Integer.toString(i);
//                  MenuData[8] =Integer.toString(j);
//                  System.out.println("야채");
//               }
//            }
//         }

         if (btn == breadToMenu)
         {
           bread.removeAll();
           breadMenu1.removeAll();
           breadOption.removeAll();
            f.remove(bread);
            f.setVisible(false);
            f.add(menu);
            f.setVisible(true);
         }
         
         
         else if (btn == toppingToBread)
         {
            bread = new JPanel();
            breadMenu1 = new JPanel();
            breadOption = new JPanel();
            breadToAddi = new JButton("다음");
            breadToMenu = new JButton("이전");
//            bread.removeAll();
//            breadMenu1.removeAll();
//            breadOption.removeAll();
            f.remove(topping);
            selectbread();
         }
         else if(btn == breadToAddi)
         {
            topping = new JPanel();
            toppingMenu = new JPanel();
            toppingOption = new JPanel();
            toppingMenus = new JButton[4][2];
            toppingToVege = new JButton("다음");
            toppingToBread = new JButton("이전");
//            topping.removeAll();
//            toppingMenu.removeAll();
//            toppingOption.removeAll();
            selectAdditionalTopping();
         }
         
         else if (btn ==veseToAddi)
         {
            topping = new JPanel();
            toppingMenu = new JPanel();
            toppingOption = new JPanel();
            toppingMenus = new JButton[4][2];
            toppingToVege = new JButton("다음");
            toppingToBread = new JButton("이전");
            //            topping.removeAll();
            //            toppingMenu.removeAll();
            //            toppingOption.removeAll();
            f.remove(vegetable);
            selectAdditionalTopping();
         }
         else if (btn == toppingToVege)
         {
            vegetable = new JPanel();
            vegetableMenu = new JPanel();
            vegetableOption = new JPanel();
            vegetableMenus = new JButton[4][5];
            veseToSauce = new JButton("다음");
            veseToAddi = new JButton("이전");
            //            vegetable.removeAll();
            //            vegetableMenu.removeAll();
            //             vegetableOption.removeAll();
            selectVesetable();
         }
         else if (btn == veseToSauce)
         {
            sauce = new JPanel();
             sauceMenu = new JPanel();
             sauceOption = new JPanel();
             sauceMenus = new JButton[3][4];
             orderEnd = new JButton("다음");
             sauceToVese = new JButton("이전");
//            sauce.removeAll();
//            sauceMenu.removeAll();
//            sauceOption.removeAll();
            selectSauce();
         }
         
         else if (btn == sauceToVese)
         {
            vegetable = new JPanel();
            vegetableMenu = new JPanel();
            vegetableOption = new JPanel();
            vegetableMenus = new JButton[4][5];
            veseToSauce = new JButton("다음");
            veseToAddi = new JButton("이전");
//            vegetable.removeAll();
//            vegetableMenu.removeAll();
//            vegetableOption.removeAll();
            f.remove(sauce);
            selectVesetable();
         }
      }
   }

   void selectbread()
   {
      
      f.remove(menu);
      f.setVisible(false);
      breadOption.setLayout(new GridLayout(1,2));
      breadOption.add(breadToMenu);
      breadOption.add(breadToAddi);
      breadToMenu.addActionListener(this);
      breadToAddi.addActionListener(this);
      bread.setLayout(new BorderLayout());
      breadMenu1.setLayout(new GridLayout(2, 3));
      breadMenu = new JButton[2][3];
      for (int i = 0; i < 2; i++) 
      {
         for (int j = 0; j < 3; j++) 
         {
            breadMenu[i][j] = new JButton();
            breadMenu1.add(breadMenu[i][j]);
            breadMenu[i][j].addActionListener(this);
            breadMenu[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
            breadMenu[i][j].setBackground(Color.lightGray);
         }
      }
      bread.add(breadMenu1 , BorderLayout.NORTH);
      bread.add(breadOption , BorderLayout.SOUTH);
      f.add(bread , BorderLayout.CENTER);
      f.setVisible(true);
   }

   void selectAdditionalTopping()
   {
      
      f.remove(bread);
      f.setVisible(false);
      toppingOption.setLayout(new GridLayout(1,2));
      toppingOption.add(toppingToBread);
      toppingOption.add(toppingToVege);
      toppingToVege.addActionListener(this);
      toppingToBread.addActionListener(this);
      topping.setLayout(new BorderLayout());
      toppingMenu.setLayout(new GridLayout(4, 2));
      for (int i = 0; i < 4; i++) 
      {
         for (int j = 0; j < 2; j++) 
         {
            toppingMenus[i][j] = new JButton();
            toppingMenu.add(toppingMenus[i][j]);
            toppingMenus[i][j].addActionListener(this);
            toppingMenus[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
            toppingMenus[i][j].setBackground(Color.lightGray);
         }
      }
      topping.add(toppingMenu , BorderLayout.NORTH);
      topping.add(toppingOption , BorderLayout.SOUTH);
      f.add(topping , BorderLayout.CENTER);
      f.setVisible(true);
   }
   void selectVesetable()
   {
      f.remove(topping);
      f.setVisible(false);
      vegetableOption.setLayout(new GridLayout(1,2));
      vegetableOption.add(veseToAddi);
      vegetableOption.add(veseToSauce);
      veseToSauce.addActionListener(this);
      veseToAddi.addActionListener(this);
      vegetable.setLayout(new BorderLayout());
      vegetableMenu.setLayout(new GridLayout(4, 5));
      for (int i = 0; i < 4; i++) 
      {
         for (int j = 0; j < 5; j++) 
         {
            vegetableMenus[i][j] = new JButton();
            vegetableMenu.add(vegetableMenus[i][j]);
            vegetableMenus[i][j].addActionListener(this);
            vegetableMenus[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
         }
      }
      vegetable.add(vegetableMenu , BorderLayout.NORTH);
      vegetable.add(vegetableOption , BorderLayout.SOUTH);
      f.add(vegetable , BorderLayout.CENTER);
      f.setVisible(true);
   }
   void selectSauce()
   {
      f.remove(vegetable);
      f.setVisible(false);
      sauceOption.setLayout(new GridLayout(1,2));
      sauceOption.add(sauceToVese);
      sauceOption.add(orderEnd);
      sauceToVese.addActionListener(this);
      orderEnd.addActionListener(this);
      sauce.setLayout(new BorderLayout());
      sauceMenu.setLayout(new GridLayout(3, 4));
      for (int i = 0; i < 3; i++) 
      {
         for (int j = 0; j < 4 ; j++) 
         {
            sauceMenus[i][j] = new JButton();
            sauceMenu.add(sauceMenus[i][j]);
            sauceMenus[i][j].addActionListener(this);
            sauceMenus[i][j].setIcon(new ImageIcon("C:\\Users\\genki\\eclipse-workspace\\project\\src\\Picture\\3.png"));
         }
      }
      sauce.add(sauceMenu , BorderLayout.NORTH);
      sauce.add(sauceOption , BorderLayout.SOUTH);
      f.add(sauce , BorderLayout.CENTER);
      f.setVisible(true);
   }
   public static void main(String[] args) 
   {
      subway g = new subway();
      g.addLayout();
   }
}