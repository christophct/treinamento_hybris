package my.bookstore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.bookstore.core.constants.BookstoreCoreConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class BookstoreCoreManager extends GeneratedBookstoreCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( BookstoreCoreManager.class.getName() );
	
	public static final BookstoreCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BookstoreCoreManager) em.getExtension(BookstoreCoreConstants.EXTENSIONNAME);
	}
	
}
