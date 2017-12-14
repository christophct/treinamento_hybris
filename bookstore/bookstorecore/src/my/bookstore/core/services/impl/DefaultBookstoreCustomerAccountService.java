/**
 *
 */
package my.bookstore.core.services.impl;

import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

//import my.bookstore.core.enums.RewardStatusLevel;
import my.bookstore.core.services.BookstoreCustomerAccountService;


/**
 * @author chris
 *
 */
public class DefaultBookstoreCustomerAccountService extends DefaultCustomerAccountService
		implements BookstoreCustomerAccountService
{
	@Resource
	private DefaultGenericDao customerDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * my.bookstore.core.services.BookstoreCustomerAccountService#updateRewardStatusPoints(de.hybris.platform.core.model.
	 * user.CustomerModel, de.hybris.platform.core.model.order.OrderModel)
	 */
	/*@Override
	public void updateRewardStatusPoints(final CustomerModel customer, final OrderModel order)
	{

	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see my.bookstore.core.services.BookstoreCustomerAccountService#getAllCustomersForLevel(my.bookstore.core.enums.
	 * RewardStatusLevel)
	 */
	
	/*@Override
	public List<CustomerModel> getAllCustomersForLevel(final RewardStatusLevel level)
	{

	}*/

}
