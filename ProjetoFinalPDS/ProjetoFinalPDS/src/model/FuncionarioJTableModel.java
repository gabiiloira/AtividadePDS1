package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FuncionarioJTableModel extends AbstractTableModel{

		private ArrayList<Funcionario> lista;
		private String[] colunas ={" Nome ", " Email ", " Telefone ", " Data ", " Descrição ", " Local ", " Prioridade ", " Status ", " Quarto ", " Serviço ", " Código ", " Custo ", " Tempo ", " Comentário "};
		
		public FuncionarioJTableModel(ArrayList<Funcionario> lista) {
			this.lista=lista;
		}
		
		public int getRowCount() {
			return this.lista.size();
		}

		public int getColumnCount() {
			return colunas.length;
		}
		
		public Object getValueAt(int rowIndex, int columnIndex) {
			Funcionario f = lista.get(rowIndex);
			if(columnIndex == 0) {
				return f.getNome();
			} else if(columnIndex == 1) {
				return f.getEmail();
			} else if(columnIndex == 2) {
				return f.getTelefone();
			} else if(columnIndex == 3) {
				return f.getData();
			} else if(columnIndex == 4) {
				return f.getDescricao();
			} else if(columnIndex == 5) {
				return f.getLocalizacao();
			} else if(columnIndex == 6) {
				return f.getPrioridade();
			} else if(columnIndex == 7) {
				return f.getStatus();
			} else if(columnIndex == 8) {
				return f.getNumQuarto();
			} else if(columnIndex == 9) {
				return f.getTipoServico();
			} else if(columnIndex == 10) {
				return f.getCodigoServico();
			} else if(columnIndex == 11) {
				return f.getCusto();
			} else if(columnIndex == 12) {
				return f.getTempo();
			} else if(columnIndex == 13) {
				return f.getComentario();
			}
			return null;
		}
		
		public String getColumnName(int column) {
			return colunas[column];
		}
	}