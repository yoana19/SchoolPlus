package main;


import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WebsiteBuilder extends JFrame {

	private JPanel contentPane;
	private JButton btnCreateWebsite;
	private JTextArea txtCode;
	private JButton btnTitle;
	private JButton btnCreateFolder;
	private JButton btnSave;
	private JButton btnHeader;
	static String oldContent = "";
	private JButton btnParagraph;
	private JButton btnCreateMenu;
	private JButton btnImage;
	private JButton btnTest;
	private JButton btnComment;
	
	String cssFilePath;
	String htmlFilePath;
	private JButton btnOpen1;
	private JScrollPane scrollPane;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebsiteBuilder frame = new WebsiteBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	
	/*public void savehtml() {
		
		final String filename = "/src/index.xml";

		
		    Class c=null;
		    try {
		      c = Class.forName("savehtml");
		    } catch (Exception ex) {
		      // This should not happen.
		    }
		    InputStream s = c.getResourceAsStream(filename);
		    txtCode.setText(s.toString());
	}*/
	
	public static void inputhtml() {
		File fileToBeModified = new File("src/index.xml");
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/index.xml"));
			
			try {
			String line = reader.readLine();

			while (line != null) 
			{
			        oldContent = oldContent + line + System.lineSeparator();
			        line = reader.readLine();
			}
			
			} catch(IOException e1) {
				
				e1.printStackTrace();
			} 
			
		} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	
	
	public static void inputcss() {
		File fileToBeModified = new File("src/css.xml");
		
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/css.xml"));
			
			try {
			String line = reader.readLine();

			while (line != null) 
			{
			        oldContent = oldContent + line + System.lineSeparator();
			        line = reader.readLine();
			}
			
			} catch(IOException e1) {
				
				e1.printStackTrace();
			} 
			
		} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
	
	
	public WebsiteBuilder() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 610, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//this.getClass().getClassLoader().getResourceAsStream("/index.xml");
		//this.getClass().getClassLoader().getResourceAsStream("/css.xml");
		
		Reader fileReader = null;

		InputStream is = this.getClass().getResourceAsStream("/index.xml");
		if (null != is) {
		    fileReader = new InputStreamReader(is);
		}
		
		btnCreateWebsite = new JButton("Create Website");
		btnCreateWebsite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inputhtml();
				
					
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				htmlFilePath = fc.getSelectedFile().getPath() + ".html";
				try {
					BufferedWriter out = new BufferedWriter (
							new OutputStreamWriter(
									new FileOutputStream(
											htmlFilePath
											//fc.getSelectedFile().getPath()
											),
									"UTF-8")
							);
					txtCode.setText(oldContent);
					out.write(oldContent
							);
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
				try {
					
						String fileContent = "";
						
						BufferedReader in = new BufferedReader(
								new InputStreamReader(
										new FileInputStream(
												fc.getSelectedFile()),
										"UTF-8"));
						String nextLine = in.readLine();
						
						while (nextLine != null) {
							fileContent += nextLine + "\n";
							nextLine = in.readLine();
						}
						
						txtCode.setText(fileContent);
						
					}
					
				catch (IOException e1) {
						e1.printStackTrace();
					}

				//savehtml();
			       
				
			}
		});
		btnCreateWebsite.setBounds(6, 23, 160, 58);
		contentPane.add(btnCreateWebsite);
		
		btnTitle = new JButton("Add Title");/////////
		btnTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				final String inputValue = JOptionPane.showInputDialog("Enter the title for site here");
				
				JPanel panel = new JPanel();
		        panel.add(new JLabel("Enter a title:"));
		        JTextField textField = new JTextField(10);
		        panel.add(textField);
				
				File fileToBeModified = new File("src/index.xml");
				String oldContent = "";
				try {
					BufferedReader reader = new BufferedReader(new FileReader("src/index.xml"));
					
					try {
					String line = reader.readLine();

					while (line != null) 
					{
					        oldContent = oldContent + line + System.lineSeparator(); 
					        line = reader.readLine();
					}
					
					} catch(IOException e1) {
						
					}
					
				
				
					String newContent = oldContent.replaceAll("<head>", "<head>\n" + "<title>" + inputValue + "</title>");
					
					
					txtCode.setText(newContent);
					
					FileWriter writer = new FileWriter("src/index.xml");
					writer.write(newContent);
					reader.close();
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		btnTitle.setBounds(6, 204, 160, 43);
		contentPane.add(btnTitle);
		
		btnCreateFolder = new JButton("Create Folder");
		btnCreateFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frame = new JFrame();

	            JFileChooser fc = new JFileChooser();

	            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	            fc.setFileFilter( new FileFilter(){

	                public boolean accept(File f) {
	                    return f.isDirectory();
	                }

	                public String getDescription() {
	                    return "Any folder";
	                }

	            });

	            fc.setDialogType(JFileChooser.SAVE_DIALOG);
	            fc.setApproveButtonText("Select");

	            frame.getContentPane().add(fc);


	            frame.setVisible(true);
	            
	            ArrayList<JPanel> jpanels = new ArrayList<JPanel>();

	            for(Component c : fc.getComponents()){
	                if( c instanceof JPanel ){
	                    jpanels.add((JPanel)c);
	                }
	            }

	            jpanels.get(0).getComponent(0).setVisible(false);

	            frame.pack();
	            
	            File dir = fc.getSelectedFile();
                if(!dir.exists()){
                    dir = dir.getParentFile();
                }
				
				
				/*JFileChooser fc = new JFileChooser();
				int returnValue = fc.showOpenDialog(contentPane);
				try {
					
					String fileContent = "";
					
					BufferedReader in = new BufferedReader(
							new InputStreamReader(
									new FileInputStream(
											fc.getSelectedFile()),
									"UTF-8"));
					String nextLine = in.readLine();
					
					while (nextLine != null) {
						fileContent += nextLine + "\n";
						nextLine = in.readLine();
					}
					
					textArea.setText(fileContent);
					
				}
				
			catch (IOException e1) {
					e1.printStackTrace();
				}
				
				btnAddTitle.setVisible(true);*/

			}
		});
		btnCreateFolder.setBounds(6, 92, 160, 58);
		contentPane.add(btnCreateFolder);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JFileChooser fc = new JFileChooser();
				
				/*File file = fc.getSelectedFile();
				File file = new File(fc.getSelectedFile()+".html");
				String filePath = file.getPath();
				file = new File(filePath + ".html");*/
				
				//int returnValue = fc.showSaveDialog(contentPane);
				JFileChooser fc = new JFileChooser();
				
				int returnValue = fc.showSaveDialog(contentPane);
				try {
					BufferedWriter out = new BufferedWriter (
							new OutputStreamWriter(
									new FileOutputStream(
											htmlFilePath 
											// fc.getSelectedFile().getPath()  + ".css"
											),
									"UTF-8")
							);
					out.write(txtCode.getText());
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
			/*File file = fc.getSelectedFile();
			if (FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("xml")) {
			    // filename is OK as-is
			} else {
			      // append .xml if "foo.jpg.xml" is OK
			    file = new File(file.getParentFile(), FilenameUtils.getBaseName(file.getName())+".xml"); // ALTERNATIVELY: remove the extension (if any) and replace it with ".xml"
			}*/
			
			
			
			/*File f = c.getSelectedFile();
			String filePath = f.getPath();
			if(!filePath.toLowerCase().endsWith(".txt"))
			{
			    f = new File(filePath + ".txt");
			}*/
			
		});
		btnSave.setBounds(489, 63, 95, 29);
		contentPane.add(btnSave);
		
		btnHeader = new JButton("Add Header");
		btnHeader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				//inputhtml();
				
				final String inputValue = JOptionPane.showInputDialog("Enter a header");
				
				File fileToBeModified = new File("src/index.xml");
				String oldContent = "";
				try {
					BufferedReader reader = new BufferedReader(new FileReader("src/index.xml"));
					
					try {
					String line = reader.readLine();

					while (line != null) 
					{
					        oldContent = oldContent + line + System.lineSeparator();
					        line = reader.readLine();
					}
					
					} catch(IOException e1) {
						
					}
					
					String newContent = oldContent.replaceAll("<body>", "<body>\n" + "<h1>" + inputValue + "</h1>");
				
					txtCode.setText(newContent);
				
					FileWriter writer = new FileWriter("src/index.xml");
					writer.write(newContent);
					reader.close();
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnHeader.setBounds(6, 258, 160, 43);
		contentPane.add(btnHeader);
		
		btnParagraph = new JButton("Add Paragraph");
		btnParagraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
					//inputhtml();
				
					final String inputValue = JOptionPane.showInputDialog("Enter a paragraph");
					
					File fileToBeModified = new File("src/index.xml");
					String oldContent = "";
					try {
						BufferedReader reader = new BufferedReader(new FileReader("src/index.xml"));
						
						try {
						String line = reader.readLine();

						while (line != null) 
						{
						        oldContent = oldContent + line + System.lineSeparator();
						        line = reader.readLine();
						}
						
						} catch(IOException e1) {
							
						}
						
						String newContent = oldContent.replaceAll("</h1>", "</h1>\n" + "<p>" + inputValue + "</p>");
					
						txtCode.setText(newContent);
					
						FileWriter writer = new FileWriter("src/index.xml");
						writer.write(newContent);
						reader.close();
						writer.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnParagraph.setBounds(6, 312, 160, 43);
		contentPane.add(btnParagraph);
		
		btnImage = new JButton("Add Image");
		btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Before adding an image, make sure that you have added it to the folder with the HTML file.");
				
				//inputhtml();
				
				final String inputValue = JOptionPane.showInputDialog("Enter the name of the photo e.g. 'dog.jpg'");
				
				final String inputValue1 = JOptionPane.showInputDialog("Enter text that will be shown when the image is unavailable");
						
				File fileToBeModified = new File("src/index.xml");
				String oldContent = "";
				try {
					BufferedReader reader = new BufferedReader(new FileReader("src/index.xml"));
					
					try {
					String line = reader.readLine();

					while (line != null) 
					{
					        oldContent = oldContent + line + System.lineSeparator();
					        line = reader.readLine();
					}
					
					} catch(IOException e1) {
						
					}
					
					String newContent = oldContent.replaceAll("</p>", "</p>\n"  + "<img src=" + '"' + inputValue + '"' + " alt=" + inputValue1 + " width=auto" + " height=auto"); 
					txtCode.setText(newContent);
				
					FileWriter writer = new FileWriter("src/index.xml");
					writer.write(newContent);
					reader.close();
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnImage.setBounds(6, 366, 160, 43);
		contentPane.add(btnImage);
		
		btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*// create jeditorpane
		        JEditorPane jEditorPane = new JEditorPane();
		        
		        // make it read-only
		        jEditorPane.setEditable(false);
		        
		        // create a scrollpane; modify its attributes as desired
		        JScrollPane scrollPane = new JScrollPane(jEditorPane);
		        
		        // add an html editor kit
		        HTMLEditorKit kit = new HTMLEditorKit();
		        jEditorPane.setEditorKit(kit);
		       
		        
		        
		        Scanner s = null;
		        String str;

		        try {
		            s = new Scanner(new BufferedReader(new FileReader("css.xml")));
		         do{
		            //while (s.hasNext()) {
		                 str=s.next();
		                if((s.hasNext((";"))))
		               {
		                        //System.out.println(s.next()+" "+s.next() );
		                        //System.out.println(s.next());     
		                        System.out.println(str);
		                        //s.next();
		                        String color = str;
		                        txtCode2.setText(color);
		                    }

		            //System.out.println(s.next());

		            }while(s.hasNext());
		         
		        } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		        finally{
		            if (s != null) {
		                //s.close();
		            }
		        }
		    
		        
		        
		        
		        
		        
		        // add some styles to the html
		        StyleSheet styleSheet = kit.getStyleSheet();
		        styleSheet.addRule("body {color:; font-family:times; margin: 4px; }");
		        styleSheet.addRule("h1 {color: blue;}");
		        styleSheet.addRule("h2 {color: #ff0000;}");
		        styleSheet.addRule("pre {font : 10px monaco; color : black; background-color : #fafafa; }");

		        
		        
		        
		        
		        
		        // create some simple html as a string
		       
		        String fileContent = txtCode.getText();
		        
		        // create a document, set it on the jeditorpane, then add the html
		        Document doc = kit.createDefaultDocument();
		        jEditorPane.setDocument(doc);
		        jEditorPane.setText(fileContent);

		        // now add it all to a frame
		        JFrame j = new JFrame("HtmlEditorKit Test");
		        j.getContentPane().add(scrollPane, BorderLayout.CENTER);

		        // make it easy to close the application
		        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		        // display the frame
		        j.setSize(new Dimension(300,200));
		        
		        // pack it, if you prefer
		        //j.pack();
		        
		        // center the jframe, then make it visible
		        j.setLocationRelativeTo(null);
		        j.setVisible(true);*/
				
				
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showSaveDialog(contentPane);
				String url = fc.getSelectedFile().getPath(); 
				File htmlFile = new File(url);
				try {
					Desktop.getDesktop().browse(htmlFile.toURI());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //take text from textarea and save it as a new file?
				
				
				
			}
		});
		btnTest.setBounds(489, 23, 95, 29);
		contentPane.add(btnTest);
		
		
		btnOpen1 = new JButton("Open");
		btnOpen1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showOpenDialog(contentPane);
				try {
					if (returnValue == JFileChooser.APPROVE_OPTION) {
						String fileContent = "";
						
						BufferedReader in = new BufferedReader(
								new InputStreamReader(
										new FileInputStream (
										fc.getSelectedFile()),
									"UTF-8"	));
						String nextLine = in.readLine();
						
						while (nextLine != null) {
							fileContent += nextLine + "\n";
							nextLine = in.readLine();
						} 
						txtCode.setText(fileContent);
						
					}
				} catch (IOException e1) {
					
					
					e1.printStackTrace();	
				}
			}
			
		});
		btnOpen1.setBounds(489, 107, 95, 29);
		contentPane.add(btnOpen1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 23, 275, 455);
		contentPane.add(scrollPane);
		//btnTitle.setVisible(false);
		
		txtCode = new JTextArea();
		scrollPane.setViewportView(txtCode);
		txtCode.setWrapStyleWord(true);
		txtCode.setLineWrap(true);
		
		label = new JLabel("");
		label.setBounds(0, -2, 594, 490);
		contentPane.add(label);
		label.setIcon(new ImageIcon((Toolkit.getDefaultToolkit().getClass().getResource("/res/websitebuilder.jpg"))));
		
	
	}
}
