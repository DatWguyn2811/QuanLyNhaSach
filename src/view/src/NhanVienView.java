import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Toolkit.*;

public class NhanVienView extends JFrame {
    private JPanel headerPanel;
    private JButton btnMenu;
    private JLabel lblUserName;
    private JButton btnUserInfo;

    private JPanel contentPanel;
    private JLabel lblTotalEmployees;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JButton btnAdd;
    private JButton btnDownload;


    public NhanVienView() {
        // Thiết lập JFrame
        setTitle("Danh mục nhân viên");
        setSize(1080, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Header
        headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setBackground(new Color(132, 94, 194));
        headerPanel.setBounds(0, 0, 1080, 45);

        // Menu Button
        btnMenu = new JButton("☰");
        btnMenu.setFocusPainted(false);
        btnMenu.setBorder(null);
        btnMenu.setForeground(Color.WHITE);
        btnMenu.setFont(new Font("Roboto", Font.PLAIN, 25));
        btnMenu.setBounds(24, 10, 25, 25);

        // User Info
        lblUserName = new JLabel("Nguyen Tien Dat Nguyen Dat");
        lblUserName.setFont(new Font("Roboto", Font.BOLD, 16));
        lblUserName.setForeground(Color.WHITE);
        Dimension size = lblUserName.getPreferredSize();
        int userNameWidth = size.width;
        lblUserName.setBounds(getWidth() - userNameWidth - 24 - 30 - 5 , 10, userNameWidth, 25);

        //Button Info
        btnUserInfo = new JButton("\uD83D\uDC64");
        btnUserInfo.setFocusPainted(false);
        btnUserInfo.setBorder(null);
        btnUserInfo.setFont(new Font("Roboto", Font.PLAIN, 25));
        btnUserInfo.setBounds(getWidth() - 24 - 30 , 10, 30, 25);
        headerPanel.add(btnMenu);
        headerPanel.add(btnUserInfo);
        headerPanel.add(lblUserName);

        add(headerPanel);

        // Content
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBounds(0, 45, 1080, 723);

        add(contentPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NhanVienView::new);
    }
}
