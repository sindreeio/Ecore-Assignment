/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.Elective;
import ecore.ExamAttempt;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Attempt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.ExamAttemptImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ecore.impl.ExamAttemptImpl#getElective <em>Elective</em>}</li>
 *   <li>{@link ecore.impl.ExamAttemptImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamAttemptImpl extends MinimalEObjectImpl.Container implements ExamAttempt {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final Character GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected Character grade = GRADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamAttemptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.EXAM_ATTEMPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EXAM_ATTEMPT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Character getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrade(Character newGrade) {
		Character oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EXAM_ATTEMPT__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elective getElective() {
		if (eContainerFeatureID() != EcorePackage.EXAM_ATTEMPT__ELECTIVE) return null;
		return (Elective)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElective(Elective newElective, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElective, EcorePackage.EXAM_ATTEMPT__ELECTIVE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElective(Elective newElective) {
		if (newElective != eInternalContainer() || (eContainerFeatureID() != EcorePackage.EXAM_ATTEMPT__ELECTIVE && newElective != null)) {
			if (EcoreUtil.isAncestor(this, newElective))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElective != null)
				msgs = ((InternalEObject)newElective).eInverseAdd(this, EcorePackage.ELECTIVE__EXAM_ATTEMPTS, Elective.class, msgs);
			msgs = basicSetElective(newElective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.EXAM_ATTEMPT__ELECTIVE, newElective, newElective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElective((Elective)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				return basicSetElective(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				return eInternalContainer().eInverseRemove(this, EcorePackage.ELECTIVE__EXAM_ATTEMPTS, Elective.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.EXAM_ATTEMPT__DATE:
				return getDate();
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				return getElective();
			case EcorePackage.EXAM_ATTEMPT__GRADE:
				return getGrade();
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
			case EcorePackage.EXAM_ATTEMPT__DATE:
				setDate((Date)newValue);
				return;
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				setElective((Elective)newValue);
				return;
			case EcorePackage.EXAM_ATTEMPT__GRADE:
				setGrade((Character)newValue);
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
			case EcorePackage.EXAM_ATTEMPT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				setElective((Elective)null);
				return;
			case EcorePackage.EXAM_ATTEMPT__GRADE:
				setGrade(GRADE_EDEFAULT);
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
			case EcorePackage.EXAM_ATTEMPT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case EcorePackage.EXAM_ATTEMPT__ELECTIVE:
				return getElective() != null;
			case EcorePackage.EXAM_ATTEMPT__GRADE:
				return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
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
		result.append(" (Date: ");
		result.append(date);
		result.append(", grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //ExamAttemptImpl
