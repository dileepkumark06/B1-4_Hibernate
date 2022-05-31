package com.repository_interface;

import javax.persistence.EntityManager;


public abstract class IOrderRepositoryimpl implements IOrderRepository 
{
	private EntityManager entityManager;
	private Order order;
		public IOrderRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public Order addOrder(Order order) {
			entityManager.persist(order);
			return order;
		}
		@Override
		public Order updateOrder(Order order) {
			entityManager.merge(order);
			return order;
		}
		public Order searchOrderById(long id) {
			Order order = entityManager.find(Order.class, id);
			return order;
		}
		@Override
		public Order deleteOrder(long id) {
			return order;
		}	
}