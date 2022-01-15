package com.pb.kozhara.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class GUIClient extends JFrame {
    JTextArea client;
    JTextArea server;
    JPanel jPanel;
    JScrollPane jScrollPane;
    JButton send = new JButton("Send");
    Container cont;

    public GUIClient() {
        cont = getContentPane();
        setSize(600, 300);
        setTitle("GUIClient");
        jPanel = new JPanel();
        //str = new JTextField(30);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        client = new JTextArea(10, 10);
        server = new JTextArea(10, 10);
        jScrollPane = new JScrollPane(client);
        jPanel.add(client);jPanel.add(client);
        jPanel.add(server);
        jPanel.add(send);
        //jPanel.add(str);
        cont.add(jPanel);

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socket s = null;
                try {
                    s = new Socket("localhost", 1234);
                }catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                    s = null;
                }catch (IOException ioException) {
                    ioException.printStackTrace();
                    s = null;
                }
                if (s == null)
                    System.exit(-1);
                BufferedReader in = null;
                PrintWriter out = null;
                try {
                    in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    out = new PrintWriter(s.getOutputStream(), true);
                    out.flush();
                    String temp = client.getText();
                    out.println(temp);
                    server.setText(in.readLine());
                }catch (IOException ioException) {
                    ioException.printStackTrace();
                }finally {
                    try {
                        out.close();
                        in.close();
                        s.close();
                    }catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIClient guiClient = new GUIClient();
                guiClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                guiClient.setVisible(true);
            }
        });
    }
}
