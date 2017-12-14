/**
 *
 */
package my.bookstore.core.daos.impl;

import static org.junit.Assert.assertEquals;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

//import my.bookstore.core.daos.RentalDao;
//import my.bookstore.core.model.BookModel;
//import my.bookstore.core.model.RentalModel;


/**
 * @author chris
 *
 */
@IntegrationTest
public class DefaultRentalDaoTest extends ServicelayerTransactionalTest
{
	private static final String TEST_BASESITE_UID = "bookstore";

	@Resource
	private BaseSiteService baseSiteService;

	@Resource
	private UserService userService;

	/*@Resource
	private RentalDao rentalDao;
	*/

	@Before
	public void setUp() throws Exception
	{
		importCsv("/bookstorecore/test/testRentalsForCustomerService.csv", "utf-8");
		ServicelayerTest.createDefaultCatalog();
		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);
	}

	@Test
	public void testRentalsForCustomer()
	{
/*
		final UserModel user = userService.getUserForUID("dejol");

		final List<RentalModel> result = rentalDao.getActiveRentalsForCustomer((CustomerModel) user);
		assertEquals(8, result.size());
		*/
	}

	@Test
	public void testMostRentedBooks()
	{
		/*
		final List<BookModel> topRentedBooks = new ArrayList<BookModel>();
		final BookModel _b1 = new BookModel();
		_b1.setISBN10("1013742419");
		topRentedBooks.add(_b1);
		final BookModel _b2 = new BookModel();
		_b2.setISBN10("000000000001");
		topRentedBooks.add(_b2);
		final BookModel _b3 = new BookModel();
		_b3.setISBN10("000000000002");
		topRentedBooks.add(_b3);
		final BookModel _b4 = new BookModel();
		_b4.setISBN10("000000000003");
		topRentedBooks.add(_b4);
		final BookModel _b5 = new BookModel();
		_b5.setISBN10("000000000004");
		topRentedBooks.add(_b5);
		for (final BookModel bookModel : topRentedBooks)
		{
			System.out.println(bookModel.getISBN10());
		}
		final int numberOfBooks = 5;
		final List<BookModel> result = rentalDao.getMostRentedBooks(numberOfBooks);
		for (final BookModel bookModel : result)
		{
			System.out.println(bookModel.getISBN10());
		}
		assertEquals(numberOfBooks, result.size());
		assertEquals(topRentedBooks.get(0).getISBN10(), result.get(0).getISBN10());
		assertEquals(topRentedBooks.get(1).getISBN10(), result.get(1).getISBN10());
		assertEquals(topRentedBooks.get(2).getISBN10(), result.get(2).getISBN10());
		assertEquals(topRentedBooks.get(3).getISBN10(), result.get(3).getISBN10());
		assertEquals(topRentedBooks.get(4).getISBN10(), result.get(4).getISBN10());
		*/
	}

}
