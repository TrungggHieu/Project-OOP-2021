package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static utils.Utils.*;

public class MenuView extends JpanelBackground implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public final static int TYPE_EASY = 0;
    public final static int TYPE_MEDIUM = 1;
    public final static int TYPE_HARD = 2;
    private JButton btEasy;
    private JButton btMedium;
    private JButton btHard;
    private JButton btInfo;
    private JButton btQuit;
    private OnClickMenuListener onClickMenuListener;

    public MenuView(String backgroundPath) {
        super(backgroundPath);
        setVisible(false);
        initUI();
    }

    private void initUI() {
        btEasy = new JButton();
        btMedium = new JButton();
        btHard = new JButton();
        btInfo = new JButton();
        btQuit = new JButton();

        btEasy.setText(BT_EASY);
        btEasy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEasy.addActionListener(this);

        btMedium.setText(BT_MEDIUM);
        btMedium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMedium.addActionListener(this);

        btHard.setText(BT_HARD);
        btHard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btHard.addActionListener(this);

        btInfo.setText(BT_INFO);
        btInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btInfo.addActionListener(this);

        btQuit.setText(BT_QUIT);
        btQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btQuit.addActionListener(this);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(btQuit, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btInfo, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btHard, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btMedium, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btEasy, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addComponent(btEasy, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGap(10, 10, 10)
                        .addComponent(btMedium, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGap(10, 10, 10)
                        .addComponent(btHard, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btInfo, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btQuit, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case BT_EASY: if (onClickMenuListener!=null){
                onClickMenuListener.onNewGameClicked(TYPE_EASY);
            } break;
            case BT_MEDIUM: if (onClickMenuListener!=null){
                onClickMenuListener.onNewGameClicked(TYPE_MEDIUM);
            } break;
            case BT_HARD: if (onClickMenuListener!=null){
                onClickMenuListener.onNewGameClicked(TYPE_HARD);
            } break;
            case BT_INFO: if (onClickMenuListener!=null){
                onClickMenuListener.onInfoClicked();
            } break;
            case BT_QUIT: if (onClickMenuListener!=null){
                onClickMenuListener.onQuitClicked();
            } break;
            default: 
                break;
        }
    }

    public interface OnClickMenuListener{
        void onNewGameClicked(int type);
        void onInfoClicked();
        void onQuitClicked();
    }

    public void setOnClickMenuListener(OnClickMenuListener onClickMenuListener) {
        this.onClickMenuListener = onClickMenuListener;
    }
}
