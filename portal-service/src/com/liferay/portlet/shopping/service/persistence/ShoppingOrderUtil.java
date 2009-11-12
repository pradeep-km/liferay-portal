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

package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;

import com.liferay.portlet.shopping.model.ShoppingOrder;

import java.util.List;

/**
 * <a href="ShoppingOrderUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ShoppingOrderPersistence
 * @see       ShoppingOrderPersistenceImpl
 * @generated
 */
public class ShoppingOrderUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Object> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Object> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static ShoppingOrder remove(ShoppingOrder shoppingOrder)
		throws SystemException {
		return getPersistence().remove(shoppingOrder);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ShoppingOrder update(ShoppingOrder shoppingOrder,
		boolean merge) throws SystemException {
		return getPersistence().update(shoppingOrder, merge);
	}

	public static void cacheResult(
		com.liferay.portlet.shopping.model.ShoppingOrder shoppingOrder) {
		getPersistence().cacheResult(shoppingOrder);
	}

	public static void cacheResult(
		java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> shoppingOrders) {
		getPersistence().cacheResult(shoppingOrders);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder create(
		long orderId) {
		return getPersistence().create(orderId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder remove(
		long orderId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().remove(orderId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder updateImpl(
		com.liferay.portlet.shopping.model.ShoppingOrder shoppingOrder,
		boolean merge) throws com.liferay.portal.SystemException {
		return getPersistence().updateImpl(shoppingOrder, merge);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByPrimaryKey(
		long orderId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByPrimaryKey(orderId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder fetchByPrimaryKey(
		long orderId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPrimaryKey(orderId);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByGroupId(
		long groupId) throws com.liferay.portal.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByGroupId(groupId, start, end, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByGroupId_First(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByGroupId_First(groupId, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByGroupId_Last(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByGroupId_Last(groupId, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder[] findByGroupId_PrevAndNext(
		long orderId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByGroupId_PrevAndNext(orderId, groupId, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByNumber(
		java.lang.String number)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByNumber(number);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder fetchByNumber(
		java.lang.String number) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByNumber(number);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder fetchByNumber(
		java.lang.String number, boolean retrieveFromCache)
		throws com.liferay.portal.SystemException {
		return getPersistence().fetchByNumber(number, retrieveFromCache);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByPPTxnId(
		java.lang.String ppTxnId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence().findByPPTxnId(ppTxnId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder fetchByPPTxnId(
		java.lang.String ppTxnId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPPTxnId(ppTxnId);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder fetchByPPTxnId(
		java.lang.String ppTxnId, boolean retrieveFromCache)
		throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPPTxnId(ppTxnId, retrieveFromCache);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByG_U_PPPS(
		long groupId, long userId, java.lang.String ppPaymentStatus)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByG_U_PPPS(groupId, userId, ppPaymentStatus);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByG_U_PPPS(
		long groupId, long userId, java.lang.String ppPaymentStatus, int start,
		int end) throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findByG_U_PPPS(groupId, userId, ppPaymentStatus, start, end);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByG_U_PPPS(
		long groupId, long userId, java.lang.String ppPaymentStatus, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findByG_U_PPPS(groupId, userId, ppPaymentStatus, start,
			end, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByG_U_PPPS_First(
		long groupId, long userId, java.lang.String ppPaymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence()
				   .findByG_U_PPPS_First(groupId, userId, ppPaymentStatus, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder findByG_U_PPPS_Last(
		long groupId, long userId, java.lang.String ppPaymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence()
				   .findByG_U_PPPS_Last(groupId, userId, ppPaymentStatus, obc);
	}

	public static com.liferay.portlet.shopping.model.ShoppingOrder[] findByG_U_PPPS_PrevAndNext(
		long orderId, long groupId, long userId,
		java.lang.String ppPaymentStatus,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		return getPersistence()
				   .findByG_U_PPPS_PrevAndNext(orderId, groupId, userId,
			ppPaymentStatus, obc);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findAll()
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findAll(
		int start, int end) throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end);
	}

	public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end, obc);
	}

	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	public static void removeByNumber(java.lang.String number)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		getPersistence().removeByNumber(number);
	}

	public static void removeByPPTxnId(java.lang.String ppTxnId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.shopping.NoSuchOrderException {
		getPersistence().removeByPPTxnId(ppTxnId);
	}

	public static void removeByG_U_PPPS(long groupId, long userId,
		java.lang.String ppPaymentStatus)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByG_U_PPPS(groupId, userId, ppPaymentStatus);
	}

	public static void removeAll() throws com.liferay.portal.SystemException {
		getPersistence().removeAll();
	}

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	public static int countByNumber(java.lang.String number)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByNumber(number);
	}

	public static int countByPPTxnId(java.lang.String ppTxnId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByPPTxnId(ppTxnId);
	}

	public static int countByG_U_PPPS(long groupId, long userId,
		java.lang.String ppPaymentStatus)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByG_U_PPPS(groupId, userId, ppPaymentStatus);
	}

	public static int countAll() throws com.liferay.portal.SystemException {
		return getPersistence().countAll();
	}

	public static ShoppingOrderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ShoppingOrderPersistence)PortalBeanLocatorUtil.locate(ShoppingOrderPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(ShoppingOrderPersistence persistence) {
		_persistence = persistence;
	}

	private static ShoppingOrderPersistence _persistence;
}