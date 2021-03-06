package br.univel.model;

import br.univel.model.DBUtils.annotations.Coluna;
import br.univel.model.DBUtils.annotations.Id;
import br.univel.model.DBUtils.annotations.Tabela;
import br.univel.model.DBUtils.annotations.UmPraUm;

/**
 * Representação de um Item na venda
 * 
 * @author aureo
 * @since 29/10/2015 21:07
 *
 */
@Tabela(nome = "item_venda")
public class ItemVenda {

	@Id
	private Integer id;

	@Coluna(nome = "id_produto", tipo = "integer")
	@UmPraUm(coluna = "id")
	private Produto produto;

	@Coluna(nome = "id_venda", tipo = "integer")
	@UmPraUm(coluna = "id")
	private Venda venda;

	@Coluna(nome = "id_item")
	private Integer idItem;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	@Override
	public String toString() {

		return "Item Venda";
	}

}
