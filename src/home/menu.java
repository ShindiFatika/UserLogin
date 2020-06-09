/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import controller.Mysql;

/**
 *
 * @author Shindi
 */
public class menu extends JFrame implements ActionListener {
    private JPanel jpMenu = new JPanel();
    private JLabel lblhari = new JLabel("Hari/Tanggal:"),lblnomeja = new JLabel("No meja/No antrian:"),
            lblnama = new JLabel("Nama:"),lblmenumakan = new JLabel("Menu makanan:"),
            lblhargamakan = new JLabel("Harga makanan:"),lblbanyaknyamakan = new JLabel("Banyaknya makan:"), 
            lblmenuminum = new JLabel("Menu minuman:"), lblhargaminum = new JLabel ("Harga minuman:"), 
            lblbanyaknyaminum = new JLabel ("Banyaknya minum:"), lbltotal = new JLabel ("Total:"),
            lblpembayaran = new JLabel ("Pembayaran:"), lblkembalian = new JLabel ("Kembalian:"),
            lbldaftar = new JLabel("Daftar Menu"), lblmenumakansatu= new JLabel ("Mie Ayam Biasa : Rp 7.000"), lblmenumakandua= new JLabel ("Mie Ayam Ceker : Rp 8.000"),
            lblmenumakantiga= new JLabel ("Mie Ayam Bakso : Rp : 9.000"), lblmenumakanempat= new JLabel ("Mie Ayam Bakso Ceker : Rp 10.000"), 
            lblmenumakanlima= new JLabel ("Bakso Biasa : Rp 9.000"),lblmenumakanenam = new JLabel ("Bakso Jumbo Rp : 11.000"), lblmenumakantujuh = new JLabel ("Bakso Telor : Rp 10.000")
            ,lblmenuminumsatu= new JLabel ("Es Teh, Teh Hangat, Es Jeruk, Jeruk Hangat : Rp 2.500"), lblmenuminumdua= new JLabel ("Kopi : Rp 3000"),
            lblmenuminumtiga= new JLabel ("Es Milo : Rp : 4000") ; 
    private JTextField txthari = new JTextField(),txtnama = new JTextField(),txttotal
            = new JTextField(),txtpembayaran = new JTextField(),txtkembalian = new JTextField();
    private JComboBox cbonomeja = new JComboBox(), cbomenumakan = new JComboBox(),
            cbohargamakan = new JComboBox(), cbobanyaknyamakan = new JComboBox(), cbomenuminum = new JComboBox(),
            cbohargaminum = new JComboBox(), cbobanyaknyaminum = new JComboBox();
    private JButton btnTambah = new JButton("Tambah"),btnUbah = new JButton("Ubah"),
            btnHapus = new JButton("Hapus"),btnBersih = new JButton("Bersih");
   
    
    String[] strJdl={"Hari","No","Nama","Menu makanan","Harga Makanan","Banyaknya makan","Menu minuman","Harga minuman","Banyaknya minum","Total","Pembayaran","Kembalian"};
    //Deklarasi untuk Tabel
    JTable tabel = new JTable();
    JScrollPane skrTabel = new JScrollPane();
   
    menu (){
        super("Menu Utama");
        setSize(1000,700);
        jpMenu.setLayout(null);
       
        //mengatur letak objek pada container
        lblhari.setBounds(20, 20, 100, 25);
        lblnomeja.setBounds(20, 55, 150, 25);
        lblnama.setBounds(20, 90, 100, 25);
        lblmenumakan.setBounds(20, 125, 100, 25);
        lblhargamakan.setBounds(20,  160, 100, 25);
        lblbanyaknyamakan.setBounds(20, 195, 150, 25);
        lblmenuminum.setBounds(20, 230, 100, 25);
        lblhargaminum.setBounds(20, 265, 100, 25);
        lblbanyaknyaminum.setBounds(20, 300, 150, 25);
        lbltotal.setBounds(20, 335, 100, 25);
        lblpembayaran.setBounds(20, 360, 100, 25);
        lblkembalian.setBounds(20, 385, 100, 25);
        lbldaftar.setBounds(350, 195, 100, 25);
        lblmenumakansatu.setBounds(310, 230, 150, 25);
        lblmenumakandua.setBounds(310, 255, 150, 25);
        lblmenumakantiga.setBounds(310, 280, 190, 25);
        lblmenumakanempat.setBounds(310, 305, 200, 25);
        lblmenumakanlima.setBounds(310, 330, 150, 25);
        lblmenumakanenam.setBounds(310, 355, 150, 25);
        lblmenumakantujuh.setBounds(310, 380, 150, 25);
        lblmenuminumsatu.setBounds(520, 230, 340, 25);
        lblmenuminumdua.setBounds(520, 255, 150, 25);
        lblmenuminumtiga.setBounds(520, 280, 150, 25);
       
        txthari.setBounds(125, 25, 100, 25);
        cbonomeja.setBounds(125, 55, 105, 25);
        txtnama.setBounds(125, 95, 100, 25);
        cbomenumakan.setBounds(125, 125, 150, 25);
        cbohargamakan.setBounds(125, 160, 100, 25);
        cbobanyaknyamakan.setBounds(125, 195, 100, 25);
        cbomenuminum.setBounds(125, 230, 100, 25);
        cbohargaminum.setBounds(125, 265, 100, 25);
        cbobanyaknyaminum.setBounds(125,300, 100, 25);
        txttotal.setBounds(125, 340, 100, 25);
        txtpembayaran.setBounds(125, 365, 100, 25);
        txtkembalian.setBounds(125, 390, 100, 25);
       
        btnTambah.setBounds(340, 20, 85, 25);
        btnUbah.setBounds(340, 55, 85, 25);
        btnHapus.setBounds(340, 90, 85, 25);
        btnBersih.setBounds(340, 125, 85, 25);
       
        
    skrTabel.getViewport().add(tabel);
    tabel.setEnabled(true);
    skrTabel.setBounds(25, 450, 470, 115);

    //menambahkan tabel pada panel
    jpMenu.add(skrTabel);

        //mengatur/meletakkan objek pada objek panel
        jpMenu.add(lblhari);
        jpMenu.add(lblnomeja);
        jpMenu.add(lblnama);
        jpMenu.add(lblmenumakan);
        jpMenu.add(lblhargamakan);
        jpMenu.add(lblbanyaknyamakan);
        jpMenu.add(lblmenuminum);
        jpMenu.add(lblhargaminum);
        jpMenu.add(lblbanyaknyaminum);
        jpMenu.add(lbltotal);
        jpMenu.add(lblpembayaran);
        jpMenu.add(lblkembalian);
        jpMenu.add(lbldaftar);
        jpMenu.add(lblmenumakansatu);
        jpMenu.add(lblmenumakandua);
        jpMenu.add(lblmenumakantiga);
        jpMenu.add(lblmenumakanempat);
        jpMenu.add(lblmenumakanlima);
        jpMenu.add(lblmenumakanenam);
        jpMenu.add(lblmenumakantujuh);
        jpMenu.add(lblmenuminumsatu);
        jpMenu.add(lblmenuminumdua);
        jpMenu.add(lblmenuminumtiga);
        
        jpMenu.add(txthari);
        jpMenu.add(cbonomeja);
        jpMenu.add(txtnama);
        jpMenu.add(cbomenumakan);
        jpMenu.add(cbohargamakan);
        jpMenu.add(cbobanyaknyamakan);
        jpMenu.add(cbomenuminum);
        jpMenu.add(cbohargaminum);
        jpMenu.add(cbobanyaknyaminum);
        jpMenu.add(txttotal);
        jpMenu.add(txtpembayaran);
        jpMenu.add(txtkembalian);
       
        jpMenu.add(btnTambah);
        jpMenu.add(btnUbah);
        jpMenu.add(btnHapus);
        jpMenu.add(btnBersih);
       
        //mengisi combo Jenis kelamin
        cbonomeja.addItem("1");
        cbonomeja.addItem("2");
        cbonomeja.addItem("3");
        cbonomeja.addItem("4");
        cbonomeja.addItem("5");
        cbonomeja.addItem("6");
        cbomenumakan.addItem("bakso biasa");
        cbomenumakan.addItem("bakso jumbo");
        cbomenumakan.addItem("bakso telor");
        cbomenumakan.addItem("Mie ayam biasa");
        cbomenumakan.addItem("Mie ayam ceker");
        cbomenumakan.addItem("Mie ayam bakso");
        cbomenumakan.addItem("Mie ayam bakso ceker");
        cbohargamakan.addItem("9000");
        cbohargamakan.addItem("10000");
        cbohargamakan.addItem("9000");
        cbohargamakan.addItem("7000");
        cbohargamakan.addItem("8000");
        cbohargamakan.addItem("11000");
        cbobanyaknyamakan.addItem("1");
        cbobanyaknyamakan.addItem("2");
        cbobanyaknyamakan.addItem("3");
        cbobanyaknyamakan.addItem("4");
        cbobanyaknyamakan.addItem("5");
        cbobanyaknyamakan.addItem("6");
        cbobanyaknyamakan.addItem("7");
        cbobanyaknyamakan.addItem("8");
        cbobanyaknyamakan.addItem("9");
        cbobanyaknyamakan.addItem("10");
        cbomenuminum.addItem("Es teh");
        cbomenuminum.addItem("Teh hangat");
        cbomenuminum.addItem("Es jeruk");
        cbomenuminum.addItem("Jeru hangat");
        cbomenuminum.addItem("Es millo");
        cbohargaminum.addItem("2500");
        cbohargaminum.addItem("3000");
        cbohargaminum.addItem("4000");
        cbobanyaknyaminum.addItem("1");
        cbobanyaknyaminum.addItem("2");
        cbobanyaknyaminum.addItem("3");
        cbobanyaknyaminum.addItem("4");
        cbobanyaknyaminum.addItem("5");
        cbobanyaknyaminum.addItem("6");
        cbobanyaknyaminum.addItem("7");
        cbobanyaknyaminum.addItem("8");
        cbobanyaknyaminum.addItem("9");
        cbobanyaknyaminum.addItem("10");
       
        //mengatur objek agar dapat berinteraksi dengan user
        btnTambah.addActionListener(this);
        btnUbah.addActionListener(this);
        btnHapus.addActionListener(this);
        btnBersih.addActionListener(this);
       
        //menambahkan objek JPanel pada container frame
        getContentPane().add(jpMenu);
        //menampilkan tabel siswa ke komponen tabel
        TampilTabel();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //pengaturan Tabel
       
        skrTabel.getViewport().add(tabel);
        tabel.setEnabled(true);
        skrTabel.setBounds(25, 450, 470, 115);
       
        //menambahkan tabel pada panel
        jpMenu.add(skrTabel);
       
        //menambahkan objek JPanel pada container frame
        getContentPane().add(jpMenu);
        //menampilkan tabel siswa ke komponen tabel
        TampilTabel();
       
    }
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj ==btnTambah){
            Tambah();
        }
        if (obj == btnUbah){
            Ubah();
        }
        if (obj == btnHapus){
            Hapus();
        }
        Bersih();
    }
    void Bersih(){ // cara kerja tombol bersih hanya menghapus tulisan diinputan//
        txthari.setText("");
        cbonomeja.setSelectedIndex(0);
        txtnama.setText("");
        cbomenumakan.setSelectedIndex(0);
        cbohargamakan.setSelectedIndex(0);
        cbobanyaknyamakan.setSelectedIndex(0);
        cbomenuminum.setSelectedIndex(0);
        cbohargaminum.setSelectedIndex(0);
        cbobanyaknyaminum.setSelectedIndex(0);
        txttotal.setText("");
        txtpembayaran.setText("");
        txtkembalian.setText("");
      
    }
    void Tambah(){
        try{
            Mysql ObjKoneksi = new Mysql();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();        
            String sql = "INSERT INTO `pemasukan`(`Tanggal`, `Nama`, `Menu makanan`, `Banyaknya makan`, `Menu minuman`, `Banyaknya minum`, `Total`,  `Pembayaran`, `Kembalian`) VALUES ('"+txthari.getText()+
                    "','"+txtnama.getText()+"','"+cbomenumakan.getSelectedItem()+"','" +cbobanyaknyamakan.getSelectedItem()+"','"+cbomenuminum.getSelectedItem()+
                   "','"+cbobanyaknyaminum.getSelectedItem()+"','"+txttotal.getText()+"','"+txtpembayaran.getText()+"','"+txtkembalian.getText()+"')";
            int row = st.executeUpdate(sql);
           
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah ditambahkan ke"+" database","infomasi",JOptionPane.INFORMATION_MESSAGE);
              con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak ditambahkan ke"+
                    e.getMessage() ,"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
    void Ubah(){ //cara kerja tombol ubah, isi data tanggal dan nama data yg ingin dirubah lalu bisa merubah data lainya. klik ubah selesai//
        try{
            Mysql ObjKoneksi = new Mysql();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
           
            String sql = "UPDATE `pemasukan` SET `Tanggal` = '"+txthari.getText()+"',`Menu makanan`='"+cbomenumakan.getSelectedItem()+"',`Banyaknya makan`='"+cbobanyaknyamakan.getSelectedItem()+"',`Menu minuman`='"+cbomenuminum.getSelectedItem()+
                    "',`Banyaknya minum`='"+cbobanyaknyaminum.getSelectedItem()+"',`Total`='"+txttotal.getText()+"',`Pembayaran`='"+txtpembayaran.getText()+"',`Kembalian`='"+txtkembalian.getText()+
                    "' WHERE `Nama` ='"+txtnama.getText()+"' ";
           
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah di update ","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak diUbah"+
                    e.getMessage() ,"infomasi",JOptionPane.INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
    void Hapus(){ // cara kerja tombol hapus, tulis nama data yg ingin dirubah di kolom nama, lalu hapus data akan terhapus. selesai//
        try{
            Mysql ObjKoneksi = new Mysql();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "DELETE FROM pemasukan WHERE `Nama` = '"+txtnama.getText()+"' ";
            int row = st.executeUpdate(sql);
            if (row ==1){
                JOptionPane.showMessageDialog(null,"Data sudah dihapus dari " +" database","infomasi",JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Data tidak dihapus","infomasi",JOptionPane.
                    INFORMATION_MESSAGE);
        }
        TampilTabel();
    }
void TampilTabel(){
        try {
            Mysql ObjKoneksi = new Mysql();
            Connection con = ObjKoneksi.bukaKoneksi();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM pemasukan";
            ResultSet set = st.executeQuery(sql);
            //menampilkan data ke Tabel
            ResultSetTableModel model = new ResultSetTableModel(set);
            tabel.setModel(model);

            while(set.next()){
                txthari.setText(Integer.toString(set.getInt("Tanggal")));
                txtnama.setText(set.getString("Nama"));
                cbomenumakan.addItem(set.getString("Menu makanan"));
                cbobanyaknyamakan.addItem(set.getString("Banyaknya makan"));
                cbomenuminum.addItem(set.getString("Menu minuman"));
                cbobanyaknyaminum.addItem(set.getString("Banyaknya minum"));
                txttotal.setText(set.getString("Total"));
                txtpembayaran.setText(set.getString("Pembayaran"));
                txtkembalian.setText(set.getString("Kembalian"));
               
            }
        }
        catch(SQLException e) {
            System.out.println("gagal query");
        }
   }
    public static void main (String[] args){
        new menu();
    }
}    

    
    

