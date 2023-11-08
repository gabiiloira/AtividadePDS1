import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PessoaJTableModel extends AbstractTableModel{

	private ArrayList<Pessoa> lista;
	private String[] colunas ={"Nome", "CPF"};
	
	public PessoaJTableModel(ArrayList<Pessoa> lista) {
		this.lista=lista;
	}
	
	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pessoa p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} else if(columnIndex == 1) {
			return p.getCpf();
		}
		return null;
	}
	
	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
