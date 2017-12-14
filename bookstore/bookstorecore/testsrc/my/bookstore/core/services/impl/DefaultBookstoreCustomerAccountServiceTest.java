/**
 *
 */
package my.bookstore.core.services.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.OrderService;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import my.bookstore.core.enums.RewardStatusLevel;


/**
 * @author chris
 *
 */
public class DefaultBookstoreCustomerAccountServiceTest extends ServicelayerTransactionalTest
{
	private static final String TEST_BASESITE_UID = "bookstore";

	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private BaseStoreService baseStoreService;

	private CustomerModel customer;
	private OrderModel order;
	private BaseStoreModel store;

	@Resource
	private DefaultBookstoreCustomerAccountService bookstoreCustomerAccountService;

	@Resource
	private UserService userService;
	@Resource
	private OrderService orderService;


	private List<String> goldCustomerIds;


	@Before
	public void setUp() throws Exception
	{
		importCsv("/bookstorecore/test/testBookstoreCustomerAccountService.csv", "utf-8");
		ServicelayerTest.createDefaultCatalog();
		baseSiteService.setCurrentBaseSite(baseSiteService.getBaseSiteForUID(TEST_BASESITE_UID), false);

		customer = (CustomerModel) userService.getUserForUID("customer1");
		store = this.baseStoreService.getBaseStoreForUid("bookstore");
		order = this.bookstoreCustomerAccountService.getOrderForCode("orderRefcustomer1", store);


		goldCustomerIds = Arrays.asList("customer4", "customer5", "customer6");
	}
	@Test
	public void testUpdateRewardStatusPoint()
	{

	}

	@Test
	public void testGetAllCustomersForLevel()
	{

	}
}
