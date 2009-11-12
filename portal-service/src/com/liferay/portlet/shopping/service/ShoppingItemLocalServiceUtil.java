/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.shopping.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * <a href="ShoppingItemLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides static methods for the
 * {@link ShoppingItemLocalService} bean. The static methods of
 * this class calls the same methods of the bean instance. It's convenient to be
 * able to just write one line to call a method on a bean instead of writing a
 * lookup call and a method call.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ShoppingItemLocalService
 * @generated
 */
public class ShoppingItemLocalServiceUtil {
	public static com.liferay.portlet.shopping.model.ShoppingItem addShoppingItem(
		com.liferay.portlet.shopping.model.ShoppingItem shoppingItem)
		throws com.liferay.portal.SystemException {
		return getService().addShoppingItem(shoppingItem);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem createShoppingItem(
		long itemId) {
		return getService().createShoppingItem(itemId);
	}

	public static void deleteShoppingItem(long itemId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().deleteShoppingItem(itemId);
	}

	public static void deleteShoppingItem(
		com.liferay.portlet.shopping.model.ShoppingItem shoppingItem)
		throws com.liferay.portal.SystemException {
		getService().deleteShoppingItem(shoppingItem);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	public static java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getShoppingItem(
		long itemId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getShoppingItem(itemId);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getShoppingItems(
		int start, int end) throws com.liferay.portal.SystemException {
		return getService().getShoppingItems(start, end);
	}

	public static int getShoppingItemsCount()
		throws com.liferay.portal.SystemException {
		return getService().getShoppingItemsCount();
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem updateShoppingItem(
		com.liferay.portlet.shopping.model.ShoppingItem shoppingItem)
		throws com.liferay.portal.SystemException {
		return getService().updateShoppingItem(shoppingItem);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem updateShoppingItem(
		com.liferay.portlet.shopping.model.ShoppingItem shoppingItem,
		boolean merge) throws com.liferay.portal.SystemException {
		return getService().updateShoppingItem(shoppingItem, merge);
	}

	public static void addBookItems(long userId, long groupId, long categoryId,
		java.lang.String[] isbns)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().addBookItems(userId, groupId, categoryId, isbns);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem addItem(
		long userId, long groupId, long categoryId, java.lang.String sku,
		java.lang.String name, java.lang.String description,
		java.lang.String properties, java.lang.String fieldsQuantities,
		boolean requiresShipping, int stockQuantity, boolean featured,
		java.lang.Boolean sale, boolean smallImage,
		java.lang.String smallImageURL, java.io.File smallFile,
		boolean mediumImage, java.lang.String mediumImageURL,
		java.io.File mediumFile, boolean largeImage,
		java.lang.String largeImageURL, java.io.File largeFile,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemField> itemFields,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> itemPrices,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService()
				   .addItem(userId, groupId, categoryId, sku, name,
			description, properties, fieldsQuantities, requiresShipping,
			stockQuantity, featured, sale, smallImage, smallImageURL,
			smallFile, mediumImage, mediumImageURL, mediumFile, largeImage,
			largeImageURL, largeFile, itemFields, itemPrices, serviceContext);
	}

	public static void addItemResources(long itemId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService()
			.addItemResources(itemId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addItemResources(long itemId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService()
			.addItemResources(itemId, communityPermissions, guestPermissions);
	}

	public static void addItemResources(
		com.liferay.portlet.shopping.model.ShoppingItem item,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService()
			.addItemResources(item, addCommunityPermissions, addGuestPermissions);
	}

	public static void addItemResources(
		com.liferay.portlet.shopping.model.ShoppingItem item,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService()
			.addItemResources(item, communityPermissions, guestPermissions);
	}

	public static void deleteItem(long itemId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().deleteItem(itemId);
	}

	public static void deleteItem(
		com.liferay.portlet.shopping.model.ShoppingItem item)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().deleteItem(item);
	}

	public static void deleteItems(long groupId, long categoryId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		getService().deleteItems(groupId, categoryId);
	}

	public static int getCategoriesItemsCount(long groupId,
		java.util.List<Long> categoryIds)
		throws com.liferay.portal.SystemException {
		return getService().getCategoriesItemsCount(groupId, categoryIds);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getFeaturedItems(
		long groupId, long categoryId, int numOfItems)
		throws com.liferay.portal.SystemException {
		return getService().getFeaturedItems(groupId, categoryId, numOfItems);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getItem(
		long itemId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItem(itemId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getItem(
		long companyId, java.lang.String sku)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItem(companyId, sku);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getItemByLargeImageId(
		long largeImageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItemByLargeImageId(largeImageId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getItemByMediumImageId(
		long mediumImageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItemByMediumImageId(mediumImageId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem getItemBySmallImageId(
		long smallImageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItemBySmallImageId(smallImageId);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getItems(
		long groupId, long categoryId)
		throws com.liferay.portal.SystemException {
		return getService().getItems(groupId, categoryId);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getItems(
		long groupId, long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getService().getItems(groupId, categoryId, start, end, obc);
	}

	public static int getItemsCount(long groupId, long categoryId)
		throws com.liferay.portal.SystemException {
		return getService().getItemsCount(groupId, categoryId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem[] getItemsPrevAndNext(
		long itemId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService().getItemsPrevAndNext(itemId, obc);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> getSaleItems(
		long groupId, long categoryId, int numOfItems)
		throws com.liferay.portal.SystemException {
		return getService().getSaleItems(groupId, categoryId, numOfItems);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingItem> search(
		long groupId, long[] categoryIds, java.lang.String keywords, int start,
		int end) throws com.liferay.portal.SystemException {
		return getService().search(groupId, categoryIds, keywords, start, end);
	}

	public static int searchCount(long groupId, long[] categoryIds,
		java.lang.String keywords) throws com.liferay.portal.SystemException {
		return getService().searchCount(groupId, categoryIds, keywords);
	}

	public static com.liferay.portlet.shopping.model.ShoppingItem updateItem(
		long userId, long itemId, long groupId, long categoryId,
		java.lang.String sku, java.lang.String name,
		java.lang.String description, java.lang.String properties,
		java.lang.String fieldsQuantities, boolean requiresShipping,
		int stockQuantity, boolean featured, java.lang.Boolean sale,
		boolean smallImage, java.lang.String smallImageURL,
		java.io.File smallFile, boolean mediumImage,
		java.lang.String mediumImageURL, java.io.File mediumFile,
		boolean largeImage, java.lang.String largeImageURL,
		java.io.File largeFile,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemField> itemFields,
		java.util.List<com.liferay.portlet.shopping.model.ShoppingItemPrice> itemPrices,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return getService()
				   .updateItem(userId, itemId, groupId, categoryId, sku, name,
			description, properties, fieldsQuantities, requiresShipping,
			stockQuantity, featured, sale, smallImage, smallImageURL,
			smallFile, mediumImage, mediumImageURL, mediumFile, largeImage,
			largeImageURL, largeFile, itemFields, itemPrices, serviceContext);
	}

	public static ShoppingItemLocalService getService() {
		if (_service == null) {
			_service = (ShoppingItemLocalService)PortalBeanLocatorUtil.locate(ShoppingItemLocalService.class.getName());
		}

		return _service;
	}

	public void setService(ShoppingItemLocalService service) {
		_service = service;
	}

	private static ShoppingItemLocalService _service;
}