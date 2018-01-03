package com.javalec.ex;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException { //�� �ѹ�
    	// TODO Auto-generated method stub
    	System.out.println("init");
    }

	@Override
	public void destroy() {  //���� �簡���ǰų� ���������� �����Ҷ�
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
	
	
	@PostConstruct  //��ó���۾� init�ϱ����� �۾�
	private void initPostConstruct() {  //�޼ҵ���� ���Ƿ� ������
		// TODO Auto-generated method stub
		System.out.println("initPostConstruct");
	}
	
	@PreDestroy    //��ó�� �ڿ������� �Ŀ� �۾�
	private void destoryPreDestory() {
		// TODO Auto-generated method stub
		System.out.println("destoryPreDestory");
	}

}