package factory;

import dao.UserDao;

import dao.UserDaoImpl;

import repositery.Repositery;

import service.UserService;

import service.UserServiceImpl;



public class UserFactory {

	public static UserDao createUserDaoObject() {

		return new UserDaoImpl();

	}

	

	public static UserService getUserServiceObject() {

		return new UserServiceImpl();

	}

	

	public static Repositery  getRepositoryObject() {

		return new Repositery();

	}



}