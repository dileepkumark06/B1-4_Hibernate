package com.repository_interface;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public interface IOrderRepository  
{
	abstract Order addOrder (Order order);
	abstract Order updateOrder(Order order);
	abstract Order searchOrder(long id);
	abstract Order deleteOrder(long id);
}	