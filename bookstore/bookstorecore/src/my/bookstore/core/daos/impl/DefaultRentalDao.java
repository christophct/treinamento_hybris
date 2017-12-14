/**
 *
 */
package my.bookstore.core.daos.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import my.bookstore.core.daos.RentalDao;
//import my.bookstore.core.model.BookModel;
//import my.bookstore.core.model.RentalModel;

/**
 * @author chris
 *
 */
public class DefaultRentalDao implements RentalDao
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	/* (non-Javadoc)
	 * @see my.bookstore.core.daos.RentalDao#getActiveRentalsForCustomer()
	 */
	/*@Override
	public List<RentalModel> getActiveRentalsForCustomer(final CustomerModel customer)
	{
		return null;
	}*/

	/*
	 * (non-Javadoc)
	 *
	 * @see my.bookstore.core.daos.RentalDao#getMostRentedBooks(int)
	 */
	/*@Override
	public List<BookModel> getMostRentedBooks(final int numberOfBooks)
	{
		return null;
	}*/

}
