package reviewfilms;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IHMPrincipale extends javax.swing.JFrame {

    Fonctions function;
    private String Pseudo, Mdp;
    private JFileChooser choix;
    private Films[] Tab;
    private int compteurFilm;
    Films film;
    boolean rev = true;

    public IHMPrincipale() {
        initComponents();
        this.getContentPane().setBackground(new Color(20, 24, 28));
        //ici je cache de force les labels que je souhaite faire apparaître après la connexion
        jLabelimg.setVisible(false);
        jLabelPseudoFinal.setVisible(false);
        jLabelbio.setVisible(false);
        jButtonEdit.setVisible(false);
        jSeparator2.setVisible(false);
        jLabelimgun.setVisible(false);
        jLabelimgdeux.setVisible(false);
        jLabelimgtrois.setVisible(false);
        jLabelfilmpref.setVisible(false);
        jButtonSauv.setVisible(false);
        jLabelfilmvu.setVisible(false);
        //ici on initialise la bibliothèque de films
        Tab = new Films[5];
        int i = 0;
        Films l1 = new Films("Blade Runner", "bladeruuner", 0, "Ridley Scott");
        Films l2 = new Films("Maborosi", "mabo", 5, "Kore-eda");
        Films l3 = new Films("Ran", "ran", 7, "Akira Kurosawa");
        Films l4 = new Films("Good Time", "goodtime", 10, "Safdie");
        Films l5 = new Films("Rêves", "reves", 10, "Akira Kurosawa");
        Tab[0] = l1;
        Tab[1] = l2;
        Tab[2] = l3;
        Tab[3] = l4;
        Tab[4] = l5;
        mesfilms();
    }

    //permet de voir tous les films sur mon TextArea                         
    public void mesfilms() {
        int i = 0;
        for (i = 0; i < 5; i++) {
            jTextAreaRecherche.append("" + Tab[i].getTitre() + "\t" + Tab[i].getAuteur() + "\t" + Tab[i].getNote() + " /10" + "\n");
        }
        jLabelResultatsfilm.setText("Film(s) trouvé(s) : 5");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelFirstCo = new javax.swing.JLabel();
        jLabelPseudo = new javax.swing.JLabel();
        jLabelmdp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPseudo = new javax.swing.JTextField();
        jButtonValider = new javax.swing.JButton();
        jLabelimg = new javax.swing.JLabel();
        jLabelPseudoFinal = new javax.swing.JLabel();
        jLabelbio = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelfilmpref = new javax.swing.JLabel();
        jLabelimgun = new javax.swing.JLabel();
        jLabelimgtrois = new javax.swing.JLabel();
        jLabelimgdeux = new javax.swing.JLabel();
        jButtonSauv = new javax.swing.JButton();
        jLabelfilmvu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRechercher = new javax.swing.JTextField();
        jButtonRechercher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecherche = new javax.swing.JTextArea();
        jLabelimageRecherche = new javax.swing.JLabel();
        jLabelResultatsfilm = new javax.swing.JLabel();
        jLabelAuteur = new javax.swing.JLabel();
        jLabelTitre = new javax.swing.JLabel();
        jLabelNote = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelTitreReview = new javax.swing.JLabel();
        jTextFieldReview = new javax.swing.JTextField();
        jButtonReview = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaReview = new javax.swing.JTextArea();
        jTextFieldReviewNote = new javax.swing.JTextField();
        jTextFieldReviewNote1 = new javax.swing.JTextField();
        jTextFieldReviewNote2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionnaire de films - Clément");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(20, 24, 28));
        jTabbedPane1.setForeground(new java.awt.Color(255, 153, 51));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(20, 24, 28));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jLabelFirstCo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFirstCo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelFirstCo.setText("Première connexion ?");

        jLabelPseudo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPseudo.setForeground(new java.awt.Color(255, 153, 51));
        jLabelPseudo.setText("Votre pseudo :");

        jLabelmdp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelmdp.setForeground(new java.awt.Color(255, 153, 51));
        jLabelmdp.setText("Votre mot de passe :");

        jButtonValider.setText("Valider");
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jLabelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ano.png"))); // NOI18N
        jLabelimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelimgMouseClicked(evt);
            }
        });

        jLabelPseudoFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPseudoFinal.setForeground(new java.awt.Color(255, 153, 51));

        jLabelbio.setForeground(new java.awt.Color(255, 153, 51));
        jLabelbio.setText("En apprendre plus sur moi - ma bio !");
        jLabelbio.setToolTipText("");
        jLabelbio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelbio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabelfilmpref.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelfilmpref.setForeground(new java.awt.Color(255, 153, 51));
        jLabelfilmpref.setText("Mes films préférés :");

        jLabelimgun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelimgun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelimgun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelimgunMouseClicked(evt);
            }
        });

        jLabelimgtrois.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelimgtrois.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelimgtrois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelimgtroisMouseClicked(evt);
            }
        });

        jLabelimgdeux.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelimgdeux.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelimgdeux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelimgdeuxMouseClicked(evt);
            }
        });

        jButtonSauv.setText("Sauvegarder");
        jButtonSauv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSauvActionPerformed(evt);
            }
        });

        jLabelfilmvu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelfilmvu.setForeground(new java.awt.Color(255, 153, 51));
        jLabelfilmvu.setText("Nombre de films vu :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPseudoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelmdp, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelPseudo))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabelFirstCo))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jSeparator1)
                                                    .addComponent(jTextFieldPseudo)
                                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(250, 250, 250)
                                        .addComponent(jButtonEdit))
                                    .addComponent(jLabelbio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jLabelfilmpref)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValider)
                        .addGap(222, 222, 222))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelfilmvu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSauv)
                                .addGap(124, 124, 124))
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelimgun, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelimgdeux, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelimgtrois, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelPseudoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabelPseudo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFirstCo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelbio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmdp)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelfilmpref)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelimgun, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelimgtrois, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelimgdeux, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSauv)
                    .addComponent(jLabelfilmvu))
                .addGap(188, 188, 188))
        );

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setBackground(new java.awt.Color(20, 24, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Chercher un film en particulier :");

        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jTextAreaRecherche.setColumns(20);
        jTextAreaRecherche.setRows(5);
        jTextAreaRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaRechercheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaRecherche);

        jLabelResultatsfilm.setForeground(new java.awt.Color(255, 153, 51));
        jLabelResultatsfilm.setText("Resultat(s) trouvé(s) :");

        jLabelAuteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAuteur.setForeground(new java.awt.Color(255, 153, 51));

        jLabelTitre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTitre.setForeground(new java.awt.Color(255, 153, 51));

        jLabelNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNote.setForeground(new java.awt.Color(255, 153, 51));

        jCheckBox1.setText("Favoris");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelimageRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabelNote, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelResultatsfilm))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRechercher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResultatsfilm)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelimageRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabelNote, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        jTabbedPane1.addTab("Rechercher", jPanel2);

        jPanel3.setBackground(new java.awt.Color(20, 24, 28));

        jLabelTitreReview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitreReview.setForeground(new java.awt.Color(255, 153, 51));
        jLabelTitreReview.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldReview.setBackground(new java.awt.Color(20, 24, 28));
        jTextFieldReview.setForeground(new java.awt.Color(255, 153, 51));

        jButtonReview.setText("Envoyer la review");
        jButtonReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReviewActionPerformed(evt);
            }
        });

        jTextAreaReview.setColumns(20);
        jTextAreaReview.setRows(5);
        jScrollPane2.setViewportView(jTextAreaReview);

        jTextFieldReviewNote.setBackground(new java.awt.Color(20, 24, 28));
        jTextFieldReviewNote.setForeground(new java.awt.Color(255, 204, 51));
        jTextFieldReviewNote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldReviewNote.setText("/  10");

        jTextFieldReviewNote1.setBackground(new java.awt.Color(20, 24, 28));
        jTextFieldReviewNote1.setForeground(new java.awt.Color(255, 204, 51));
        jTextFieldReviewNote1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldReviewNote1.setText("NOTE :");

        jTextFieldReviewNote2.setBackground(new java.awt.Color(20, 24, 28));
        jTextFieldReviewNote2.setForeground(new java.awt.Color(255, 204, 51));
        jTextFieldReviewNote2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jTextFieldReview)
                    .addComponent(jLabelTitreReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldReviewNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldReviewNote2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldReviewNote, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonReview, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTitreReview, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldReview, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonReview, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReviewNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldReviewNote2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jTextFieldReviewNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Review", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MyMovies ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Profile");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        //je récupère le pseudo et le mot de passe
        Pseudo = jTextFieldPseudo.getText();
        Mdp = jPasswordField1.getText();
        //si le pseudo et le mot de passe correspondent à "zefren" alors je charge les données de mon profil "zefren"
        if (Mdp.equals("zefren") && Pseudo.equals("zefren")) {
            function.WriteProfil();
        }
        //si le pseudo ET le mot de passe sont complétés alors j'affiche le profil
        if (Pseudo.isEmpty() == false && Mdp.isEmpty() == false) {
            jLabelFirstCo.setVisible(false);
            jLabelPseudo.setVisible(false);
            jLabelmdp.setVisible(false);
            jPasswordField1.setVisible(false);
            jTextFieldPseudo.setVisible(false);
            jButtonValider.setVisible(false);
            jSeparator1.setVisible(false);
            jLabelimg.setVisible(true);
            jLabelimgun.setVisible(true);
            jButtonSauv.setVisible(true);
            jLabelimgdeux.setVisible(true);
            jLabelimgtrois.setVisible(true);
            jLabelfilmpref.setVisible(true);
            jLabelPseudoFinal.setText(Pseudo);
            jLabelPseudoFinal.setVisible(true);
            jLabelbio.setVisible(true);
            jButtonEdit.setVisible(true);
            jLabelfilmvu.setVisible(true);
            jSeparator2.setVisible(true);
        }
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jLabelimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelimgMouseClicked
        //permet de choisir son image de profil après avoir cliqué dessus
        choix = new JFileChooser("src/img");
        int reponse = choix.showOpenDialog(null);
        if (reponse == JFileChooser.APPROVE_OPTION) {
            jLabelimg.setIcon(new ImageIcon("src/img/" + choix.getSelectedFile().getName()));
        }
    }//GEN-LAST:event_jLabelimgMouseClicked

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        //permet de changer sa bio (j'ai cherché un moyen d'intégrer les sauts de ligne "\n" avec un replace mais j'ai pas trouvé)
        String mabio = JOptionPane.showInputDialog("Modifier votre bio :");
        jLabelbio.setText(mabio);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        String nomFilm = jTextFieldRechercher.getText();
        //on réinitialise tous les labels et en particulier le jtextArea pour ne pas le surcharger
        jTextAreaRecherche.setText("");
        jLabelTitre.setText("");
        jLabelAuteur.setText("");
        jLabelNote.setText("");
        /*recherche par titre de film, 
        affiche le nombre de film trouvé puis le titre et sa note
        et enfin l'affiche du film
         */
        if (nomFilm.equals("Blade Runner")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            jTextAreaRecherche.append("" + Tab[0].getTitre() + "\t" + Tab[0].getAuteur() + "\t" + Tab[0].getNote() + " /10" + "\n");
            jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
            jLabelTitre.setText("" + Tab[0].getTitre());
            jLabelAuteur.setText("" + Tab[0].getAuteur());
            jLabelNote.setText(Tab[0].getNote() + " / 10");
        } else if (nomFilm.equals("Maborosi")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            jTextAreaRecherche.append("" + Tab[1].getTitre() + "\t" + Tab[1].getAuteur() + "\t" + Tab[1].getNote() + " /10" + "\n");
            jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
            jLabelTitre.setText("" + Tab[1].getTitre());
            jLabelAuteur.setText("" + Tab[1].getAuteur());
            jLabelNote.setText(Tab[1].getNote() + " / 10");
        } else if (nomFilm.equals("Ran")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            jTextAreaRecherche.append("" + Tab[2].getTitre() + "\t" + Tab[2].getAuteur() + "\t" + Tab[2].getNote() + " /10" + "\n");
            jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[2].getImage() + ".png"));
            jLabelTitre.setText("" + Tab[2].getTitre());
            jLabelAuteur.setText("" + Tab[2].getAuteur());
            jLabelNote.setText(Tab[2].getNote() + " / 10");
        } else if (nomFilm.equals("Good Time")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            jTextAreaRecherche.append("" + Tab[3].getTitre() + "\t" + Tab[3].getAuteur() + "\t" + Tab[3].getNote() + " /10" + "\n");
            jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
            jLabelTitre.setText("" + Tab[3].getTitre());
            jLabelAuteur.setText("" + Tab[3].getAuteur());
            jLabelNote.setText(Tab[3].getNote() + " / 10");
        } else if (nomFilm.equals("Rêves")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            jTextAreaRecherche.append("" + Tab[4].getTitre() + "\t" + Tab[4].getAuteur() + "\t" + Tab[4].getNote() + " /10" + "\n");
            jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
            jLabelTitre.setText("" + Tab[4].getTitre());
            jLabelAuteur.setText("" + Tab[4].getAuteur());
            jLabelNote.setText(Tab[4].getNote() + " / 10");
        } //Ici on affiche tous les films
        else if (nomFilm.equals("tous")) {
            mesfilms();
        } //recherche par auteur
        else if (nomFilm.equals("Akira Kurosawa")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 2");
            for (int i = 0; i < Tab.length; i++) {
                if (Tab[i].getAuteur().equals("Akira Kurosawa")) {
                    jTextAreaRecherche.append("" + Tab[i].getTitre() + "\t" + Tab[i].getAuteur() + "\t" + Tab[i].getNote() + " /10" + "\n");
                    jLabelTitre.setText("" + Tab[i].getTitre());
                    jLabelAuteur.setText("" + Tab[i].getAuteur());
                    jLabelNote.setText(Tab[i].getNote() + " / 10");
                    jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
                }
            }
        } else if (nomFilm.equals("Safdie")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            for (int i = 0; i < Tab.length; i++) {
                if (Tab[i].getAuteur().equals("Safdie")) {
                    jTextAreaRecherche.append("" + Tab[i].getTitre() + "\t" + Tab[i].getAuteur() + "\t" + Tab[i].getNote() + " /10" + "\n");
                    jLabelTitre.setText("" + Tab[i].getTitre());
                    jLabelAuteur.setText("" + Tab[i].getAuteur());
                    jLabelNote.setText(Tab[i].getNote() + " / 10");
                    jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
                }
            }
        } else if (nomFilm.equals("Kore-eda")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            for (int i = 0; i < Tab.length; i++) {
                if (Tab[i].getAuteur().equals("Kore-eda")) {
                    jTextAreaRecherche.append("" + Tab[i].getTitre() + "\t" + Tab[i].getAuteur() + "\t" + Tab[i].getNote() + " /10" + "\n");
                    jLabelTitre.setText("" + Tab[i].getTitre());
                    jLabelAuteur.setText("" + Tab[i].getAuteur());
                    jLabelNote.setText(Tab[i].getNote() + " / 10");
                    jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
                }
            }
        } else if (nomFilm.equals("Ridley Scott")) {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : 1");
            for (int i = 0; i < Tab.length; i++) {
                if (Tab[i].getAuteur().equals("Ridley Scott")) {
                    jTextAreaRecherche.append("" + Tab[i].getTitre() + "\t" + Tab[i].getAuteur() + "\t" + Tab[i].getNote() + " /10" + "\n");
                    jLabelTitre.setText("" + Tab[i].getTitre());
                    jLabelAuteur.setText("" + Tab[i].getAuteur());
                    jLabelNote.setText(Tab[i].getNote() + " / 10");
                    jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
                }
            }
        } else {
            jLabelResultatsfilm.setText("Film(s) trouvé(s) : Aucune correspondance");
        }
        //ca va nous servir à savoir de quel film on veut parler dans la review
        jLabelTitreReview.setText(jLabelTitre.getText());
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButtonRechercherActionPerformed

    private void jTextAreaRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaRechercheMouseClicked
        //ici une fois qu'on a double cliqué, l'élément en surbrillance va être comparé pour afficher le film souhaité
        if (evt.getClickCount() == 2) {
            if (jTextAreaRecherche.getSelectedText().equals("Ran")) {
                jLabelTitre.setText("" + Tab[2].getTitre());
                jLabelAuteur.setText("" + Tab[2].getAuteur());
                jLabelNote.setText(Tab[2].getNote() + " / 10");
                jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[2].getImage() + ".png"));
            }
            if (jTextAreaRecherche.getSelectedText().equals("Blade")) {
                jLabelTitre.setText("" + Tab[0].getTitre());
                jLabelAuteur.setText("" + Tab[0].getAuteur());
                jLabelNote.setText(Tab[0].getNote() + " / 10");
                jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
            }
            if (jTextAreaRecherche.getSelectedText().equals("Maborosi")) {
                jLabelTitre.setText("" + Tab[1].getTitre());
                jLabelAuteur.setText("" + Tab[1].getAuteur());
                jLabelNote.setText(Tab[1].getNote() + " / 10");
                jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
            }
            if (jTextAreaRecherche.getSelectedText().equals("Good")) {
                jLabelTitre.setText("" + Tab[3].getTitre());
                jLabelAuteur.setText("" + Tab[3].getAuteur());
                jLabelNote.setText(Tab[3].getNote() + " / 10");
                jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
            }
            if (jTextAreaRecherche.getSelectedText().equals("Rêves")) {
                jLabelTitre.setText("" + Tab[4].getTitre());
                jLabelAuteur.setText("" + Tab[4].getAuteur());
                jLabelNote.setText(Tab[4].getNote() + " / 10");
                jLabelimageRecherche.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
            }
        }
        jLabelTitreReview.setText(jLabelTitre.getText());
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jTextAreaRechercheMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //pour choisir ses films préférés, on demande par quel film on veut le remplacer
        String nomdefilm = jLabelTitre.getText();
        if (jCheckBox1.isSelected()) {
            if (nomdefilm.equals("Blade Runner")) {
                String numero = JOptionPane.showInputDialog("Placer ce film entre 1 et 3 :");
                if (numero.equals("1")) {
                    jLabelimgun.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
                }
                if (numero.equals("2")) {
                    jLabelimgdeux.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
                }
                if (numero.equals("3")) {
                    jLabelimgtrois.setIcon(new ImageIcon("src/img/" + Tab[0].getImage() + ".png"));
                }
            }
            if (nomdefilm.equals("Ran")) {
                String numero = JOptionPane.showInputDialog("Placer ce film entre 1 et 3 :");
                if (numero.equals("1")) {
                    jLabelimgun.setIcon(new ImageIcon("src/img/" + Tab[2].getImage() + ".png"));
                }
                if (numero.equals("2")) {
                    jLabelimgdeux.setIcon(new ImageIcon("src/img/" + Tab[2].getImage() + ".png"));
                }
                if (numero.equals("3")) {
                    jLabelimgtrois.setIcon(new ImageIcon("src/img/" + Tab[2].getImage() + ".png"));
                }
            }
            if (nomdefilm.equals("Maborosi")) {
                String numero = JOptionPane.showInputDialog("Placer ce film entre 1 et 3 :");
                if (numero.equals("1")) {
                    jLabelimgun.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
                }
                if (numero.equals("2")) {
                    jLabelimgdeux.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
                }
                if (numero.equals("3")) {
                    jLabelimgtrois.setIcon(new ImageIcon("src/img/" + Tab[1].getImage() + ".png"));
                }
            }
            if (nomdefilm.equals("Good Time")) {
                String numero = JOptionPane.showInputDialog("Placer ce film entre 1 et 3 :");
                if (numero.equals("1")) {
                    jLabelimgun.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
                }
                if (numero.equals("2")) {
                    jLabelimgdeux.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
                }
                if (numero.equals("3")) {
                    jLabelimgtrois.setIcon(new ImageIcon("src/img/" + Tab[3].getImage() + ".png"));
                }
            }
            if (nomdefilm.equals("Rêves")) {
                String numero = JOptionPane.showInputDialog("Placer ce film entre 1 et 3 :");
                if (numero.equals("1")) {
                    jLabelimgun.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
                }
                if (numero.equals("2")) {
                    jLabelimgdeux.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
                }
                if (numero.equals("3")) {
                    jLabelimgtrois.setIcon(new ImageIcon("src/img/" + Tab[4].getImage() + ".png"));
                }
            }
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabelimgunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelimgunMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelimgunMouseClicked

    private void jLabelimgtroisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelimgtroisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelimgtroisMouseClicked

    private void jLabelimgdeuxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelimgdeuxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelimgdeuxMouseClicked

    private void jButtonSauvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvActionPerformed
        function.ReadProfil(Pseudo, jLabelimg.getIcon().toString(), jLabelimgun.getIcon().toString(), jLabelimgdeux.getIcon().toString(), jLabelimgtrois.getIcon().toString(), jLabelbio.getText(), jLabelfilmvu.getText());
    }//GEN-LAST:event_jButtonSauvActionPerformed

    private void jButtonReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReviewActionPerformed
        String debut = jTextAreaReview.getText();
        String phrase = Pseudo + "\t" + jLabelTitreReview.getText() + "\t" + jTextFieldReview.getText() + "\t" + jTextFieldReviewNote2.getText() + "  " + jTextFieldReviewNote.getText() + "\n";
        jTextAreaReview.append(phrase);
        //ici on va sauvegarder l'ensemble des reviews
        function.reviewSave(debut, phrase);
        //permet de changer la note (j'ai pas fait un système de note globale faut pas déconner)
        if (jLabelTitreReview.getText().equals("Blade runner")) {
            Tab[0].setNote(Integer.parseInt(jTextFieldReviewNote2.getText()));
        }
        if (jLabelTitreReview.getText().equals("Maborosi")) {
            Tab[1].setNote(Integer.parseInt(jTextFieldReviewNote2.getText()));
        }
        if (jLabelTitreReview.getText().equals("Ran")) {
            Tab[2].setNote(Integer.parseInt(jTextFieldReviewNote2.getText()));
        }
        if (jLabelTitreReview.getText().equals("Good Time")) {
            Tab[3].setNote(Integer.parseInt(jTextFieldReviewNote2.getText()));
        }
        if (jLabelTitreReview.getText().equals("Rêves")) {
            Tab[4].setNote(Integer.parseInt(jTextFieldReviewNote2.getText()));
        }
        /*augmente le nombre de films vu ! (à noter que dans le fichier de sauvegarde c'est un String et pas un compteur int,
        en le modifiant on pourrait récupérer la valeur exacte, ca éviterait le reset à chaque connexion)
        */
        compteurFilm++;
        jLabelfilmvu.setText("Nombre de films vu : "+compteurFilm);
    }//GEN-LAST:event_jButtonReviewActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        //j'ai pas trouvé d'autre solution que de passer par un boolean pour afficher les reviews donc voila 
        if (rev == true) {
            function.Review();
            rev = false;
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IHMPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHMPrincipale().setVisible(true);
            }
        });
    }

    void setFonctions(Fonctions function) {
        this.function = function;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JButton jButtonReview;
    private javax.swing.JButton jButtonSauv;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAuteur;
    private javax.swing.JLabel jLabelFirstCo;
    private javax.swing.JLabel jLabelNote;
    private javax.swing.JLabel jLabelPseudo;
    private javax.swing.JLabel jLabelPseudoFinal;
    private javax.swing.JLabel jLabelResultatsfilm;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelTitreReview;
    private javax.swing.JLabel jLabelbio;
    private javax.swing.JLabel jLabelfilmpref;
    private javax.swing.JLabel jLabelfilmvu;
    private javax.swing.JLabel jLabelimageRecherche;
    private javax.swing.JLabel jLabelimg;
    private javax.swing.JLabel jLabelimgdeux;
    private javax.swing.JLabel jLabelimgtrois;
    private javax.swing.JLabel jLabelimgun;
    private javax.swing.JLabel jLabelmdp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaRecherche;
    private javax.swing.JTextArea jTextAreaReview;
    private javax.swing.JTextField jTextFieldPseudo;
    private javax.swing.JTextField jTextFieldRechercher;
    private javax.swing.JTextField jTextFieldReview;
    private javax.swing.JTextField jTextFieldReviewNote;
    private javax.swing.JTextField jTextFieldReviewNote1;
    private javax.swing.JTextField jTextFieldReviewNote2;
    // End of variables declaration//GEN-END:variables

    void Profil(String pseudo, String image, String imgun, String imgdeux, String imgtrois, String bio, String filmvu) {
        jLabelPseudo.setText(pseudo);
        jLabelimg.setIcon(new ImageIcon(image));
        jLabelimgun.setIcon(new ImageIcon(imgun));
        jLabelimgdeux.setIcon(new ImageIcon(imgdeux));
        jLabelimgtrois.setIcon(new ImageIcon(imgtrois));
        jLabelbio.setText(bio);
        jLabelfilmvu.setText(filmvu);
    }

    void review(String s) {
        jTextAreaReview.append(s);
    }
}
