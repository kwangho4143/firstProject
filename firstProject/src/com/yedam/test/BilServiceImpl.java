package com.yedam.test;



public class BilServiceImpl implements BilService {
	BoardDao dao = new BoardDao();

	@Override
	public Bilboard[] showList() {
		// TODO Auto-generated method stub
		return dao.getBilList();
	}

	@Override
	public void addBil(Bilboard bil) {
		// TODO Auto-generated method stub
		dao.addBilboard(bil);
	}

	@Override
	public void modBil(Bilboard bil) {
		// TODO Auto-generated method stub
		dao.updateBil(bil);
	}

	@Override
	public void delBil(int delId) {
		// TODO Auto-generated method stub
		dao.removeBil(delId);
	}


	

}
