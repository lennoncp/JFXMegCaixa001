package application;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.DashedLine;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import dao.ConcursosDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable{
	
	private ConcursosDAO concursosDAO;
	
	@FXML
    private Button btnLimparDezenas;

    @FXML
    private TableView<Dezenas> tvDezenas;

    @FXML
    private TableColumn<Dezenas, Integer> tcD1;

    @FXML
    private TableColumn<Dezenas, Integer> tcD2;

    @FXML
    private TableColumn<Dezenas, Integer> tcD3;

    @FXML
    private TableColumn<Dezenas, Integer> tcD4;

    @FXML
    private TableColumn<Dezenas, Integer> tcD5;

    @FXML
    private TableColumn<Dezenas, Integer> tcD6;

    @FXML
    private Slider sdImparPar;

    @FXML
    private Slider sdQuadrante5;

    @FXML
    private CheckBox ckb21a30;

    @FXML
    private CheckBox ckb51a60;

    @FXML
    private CheckBox ckb11a20;

    @FXML
    private CheckBox ckb01a10;

    @FXML
    private CheckBox ckb31a40;

    @FXML
    private CheckBox ckb41a50;

    @FXML
    private CheckBox ckb01a51;

    @FXML
    private CheckBox ckb03a53;

    @FXML
    private CheckBox ckb04a54;

    @FXML
    private CheckBox ckb02a52;

    @FXML
    private CheckBox ckb06a56;

    @FXML
    private CheckBox ckb07a57;

    @FXML
    private CheckBox ckb09a59;

    @FXML
    private CheckBox ckb08a58;

    @FXML
    private CheckBox ckb05a55;

    @FXML
    private CheckBox ckb10a60;
    
    @FXML
    private TableView<Concursos> tvConcursos;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosConcurso;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD1;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD2;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD3;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD4;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD5;

    @FXML
    private TableColumn<Concursos, Integer> tcConcursosD6;

    @FXML
    private Button btnGerarApostas;
    
    @FXML
    private TextField txfConcursosRange;

    @FXML
    private Button btnConcursosAtualizar;
    
    @FXML
    private ListView<Dezena> lvConcursosContagemGeral;

    @FXML
    private ListView<Dezena> lvConcursosContagemRange;

    @FXML
    private ListView<Dezena> lvContagemLInhas;

    @FXML
    private ListView<Dezena> lvContagemColunas;
    
    @FXML
    private ListView<Dezena> lvConcursosContagemIMpares;
    
    @FXML
    private CheckBox checkRange;
    
    @FXML
    private ListView<Dezena> lvContagemQuadrante;
    
    @FXML
    private TextField txfQTDApostas;
    
    @FXML
    private Button btnGerarPDF;


    @FXML
    void gerarApostas() {
  
    	int qtdApostas = Integer.valueOf(txfQTDApostas.getText());
    	int giros = 0;
    	while(giros < qtdApostas) {
    		FatorDeRepeticao fr = new FatorDeRepeticao();
    		
    		int impar = 0;
    		int par = 0;
    		for(int i = 0; i < 6; i++) {
    			
    			Dezena des = SLista.gaiola.get(SLista.rad.nextInt(SLista.gaiola.size()));
    			SLista.removerDaListaDezena(des);
    			SLista.removeNovamenteDaListaDezena(des.getDezena());
    			fr.removeRepedidos(des.getDezena());
    			
    			
    			if(des.getDezena() % 2 != 0) {
    				impar++;
    			}
    			
    				par++;
    				
    				if(impar>2) {
    					SLista.removerDaListaImpar();
    					System.out.println("GAIOLA IMPAR");
    					System.out.println(SLista.gaiola);
    					impar=0;
    				}
    				
    				if(par>2) {
    					SLista.removerDaListaPar();
    					System.out.println("GAIOLA PAR");
    					System.out.println(SLista.gaiola);
    					par=0;
    				}
    				
    			SLista.apostas.add(des);
    		}
    		
    		System.out.println(SLista.apostas);
    		
    		List<Integer> lista = new ArrayList<Integer>();
    		for(Dezena d : SLista.apostas) {
    			lista.add(d.getDezena());
    		}
    		
    		
    		
    		SLista.apostasRepositorio.add(new Apostas(SLista.apostasRepositorio.size() + 1, lista));
    		
    		Comparador c = new Comparador();
    		System.out.println("VerificaLinhas: " + c.verificarConcursos(SLista.apostasRepositorio));
    		
    		SLista.dezenas.add(new Dezenas(lista));
    		
    		
    		SLista.apostas.clear();
    		giros++;
    	}
    	
    }
    
    @FXML
    void limparDezenas() {
    	SLista.dezenas.clear();
    }
    
    @FXML
    void gerarPDF() {
    	try {
			PdfDocument pdf = new PdfDocument(new PdfWriter("src/files/apostas.pdf"));
			Document doc = new Document(pdf);
			
			DashedLine customLine= new DashedLine();
			customLine.setLineWidth(0);
			
			SolidLine line = new SolidLine(1F);
			line.setColor(ColorConstants.BLACK);
			LineSeparator separator = new LineSeparator(line);
			
			
			doc.add(new Paragraph("Apostas")).setTextAlignment(TextAlignment.CENTER);
			doc.add(separator);
			
			Table table = new Table(UnitValue.createPercentArray(6)).useAllAvailableWidth();       
	        for(Apostas a : SLista.apostasRepositorio) {
	        	for(Integer i : a.getDezenas()) {
	        		table.addCell(""+i);
	        	}
	        }
	        
	        doc.add(table).setTextAlignment(TextAlignment.CENTER);
			
			doc.add(separator);
			doc.add(new Paragraph(""+LocalTime.now())).setTextAlignment(TextAlignment.CENTER);
			
			doc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		SLista.checkRange = checkRange.isSelected();
		
		ContagemNova cn = new ContagemNova();
		cn.dezenasContagemGeral();
		cn.dezenasContagemRange();
		cn.dezenasContagemLinhas();
		cn.dezenasContagemColunas();
		cn.mediaImpar();
		cn.dezenaContagemGraduante();
		
		tcD1.setCellValueFactory(new PropertyValueFactory("d1"));
		tcD2.setCellValueFactory(new PropertyValueFactory("d2"));
		tcD3.setCellValueFactory(new PropertyValueFactory("d3"));
		tcD4.setCellValueFactory(new PropertyValueFactory("d4"));
		tcD5.setCellValueFactory(new PropertyValueFactory("d5"));
		tcD6.setCellValueFactory(new PropertyValueFactory("d6"));
		
		tcConcursosConcurso.setCellValueFactory(new PropertyValueFactory("concurso"));
		tcConcursosD1.setCellValueFactory(new PropertyValueFactory("d1"));
		tcConcursosD2.setCellValueFactory(new PropertyValueFactory("d2"));
		tcConcursosD3.setCellValueFactory(new PropertyValueFactory("d3"));
		tcConcursosD4.setCellValueFactory(new PropertyValueFactory("d4"));
		tcConcursosD5.setCellValueFactory(new PropertyValueFactory("d5"));
		tcConcursosD6.setCellValueFactory(new PropertyValueFactory("d6"));
		
		tvDezenas.setItems(SLista.dezenas);
	
		
		lvConcursosContagemGeral.setItems(SLista.sortedListDecrecente(SLista.dezenaContagemGeral));
		lvConcursosContagemRange.setItems(SLista.sortedListDecrecente(SLista.dezenaContagemRange));
		lvContagemLInhas.setItems(SLista.sortedListDecrecente(SLista.dezenaContagemLinhas));
		lvContagemColunas.setItems(SLista.sortedListDecrecente(SLista.dezenaContagemColunas));
		lvConcursosContagemIMpares.setItems(SLista.sortedListDecrecente(SLista.mediaImpar));
		lvContagemQuadrante.setItems(SLista.sortedListDecrecente(SLista.quadranteContagem));
		
		tvConcursos.setItems(SLista.concursos);
	}

}
