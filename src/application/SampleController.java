package application;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

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
    void gerarApostas() {
  
    	
    }
    
    @FXML
    void limparDezenas() {
    	SLista.dezenas.clear();
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
