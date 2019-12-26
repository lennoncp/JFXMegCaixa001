package application;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

import dao.ConcursosDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController implements Initializable{
	
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
    private Button btnGerarApostas;

    @FXML
    void gerarApostas() {
    	Dezenas d = new Dezenas();
    	d.setCodigo(SLista.dezenas.size() + 1);
    	d.setD1(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	d.setD2(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	d.setD3(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	d.setD4(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	d.setD5(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	d.setD6(SLista.replicadas.get(SLista.rad.nextInt(SLista.replicadas.size())).getDezena());
    	
    	SLista.dezenas.add(d);
    	
    }
    
    @FXML
    void limparDezenas() {
    	SLista.dezenas.clear();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for(Integer i = 1; i < 61; i++) {
    		SLista._60Dezenas.add(new Dezena(i, 0,0));
    		SLista.replicadas.add(new Dezena(i, 0,0));
    	}
		
		ConcursosDAO concursosDAO = new ConcursosDAO();
    	SLista.concursos = concursosDAO.getConcursos();
    
    	Contagem contagem = new Contagem();
    	contagem.contagemConcursoDezenasGeral();
		
		tcD1.setCellValueFactory(new PropertyValueFactory("d1"));
		tcD2.setCellValueFactory(new PropertyValueFactory("d2"));
		tcD3.setCellValueFactory(new PropertyValueFactory("d3"));
		tcD4.setCellValueFactory(new PropertyValueFactory("d4"));
		tcD5.setCellValueFactory(new PropertyValueFactory("d5"));
		tcD6.setCellValueFactory(new PropertyValueFactory("d6"));
		
		tvDezenas.setItems(SLista.dezenas);
	}

}
