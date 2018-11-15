package com.news.entity;

public class Pager {
	private int curPage;//当前页码
	private int rowCount;//记录总数
	private int perPageRows;//每页记录数
	private int pageCount;//总页数
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
	//修改总页数方法
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
