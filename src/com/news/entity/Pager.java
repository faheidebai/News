package com.news.entity;

public class Pager {
	private int curPage;//��ǰҳ��
	private int rowCount;//��¼����
	private int perPageRows;//ÿҳ��¼��
	private int pageCount;//��ҳ��
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getPerPageRows() {
		return perPageRows;
	}
	public void setPerPageRows(int perPageRows) {
		this.perPageRows = perPageRows;
	}
	//�޸���ҳ������
	public int getPageCount() {
		return (rowCount+perPageRows-1)/perPageRows;
//		if(rowCount%perPageRows==0){
//			return rowCount/perPageRows;
//		}else{
//			return rowCount/perPageRows+1;
//		}
		
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	

}
