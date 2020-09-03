/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.Semester;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.SemesterImpl#getSemesterNumber <em>Semester Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMESTER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemesterNumber() <em>Semester Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterNumber()
	 * @generated
	 * @ordered
	 */
	protected int semesterNumber = SEMESTER_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSemesterNumber() {
		return semesterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterNumber(int newSemesterNumber) {
		int oldSemesterNumber = semesterNumber;
		semesterNumber = newSemesterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SEMESTER__SEMESTER_NUMBER, oldSemesterNumber, semesterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.SEMESTER__SEMESTER_NUMBER:
				return getSemesterNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcorePackage.SEMESTER__SEMESTER_NUMBER:
				setSemesterNumber(SEMESTER_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcorePackage.SEMESTER__SEMESTER_NUMBER:
				return semesterNumber != SEMESTER_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semesterNumber: ");
		result.append(semesterNumber);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
