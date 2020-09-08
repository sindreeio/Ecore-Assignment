/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.IndividualStudyPlan;
import ecore.SemesterInStudyplan;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.IndividualStudyPlanImpl#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link ecore.impl.IndividualStudyPlanImpl#getSemestersInStudyplan <em>Semesters In Studyplan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualStudyPlanImpl extends MinimalEObjectImpl.Container implements IndividualStudyPlan {
	/**
	 * The default value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected String studentName = STUDENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemestersInStudyplan() <em>Semesters In Studyplan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestersInStudyplan()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterInStudyplan> semestersInStudyplan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualStudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.INDIVIDUAL_STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStudentName() {
		return studentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudentName(String newStudentName) {
		String oldStudentName = studentName;
		studentName = newStudentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.INDIVIDUAL_STUDY_PLAN__STUDENT_NAME, oldStudentName, studentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterInStudyplan> getSemestersInStudyplan() {
		if (semestersInStudyplan == null) {
			semestersInStudyplan = new EObjectContainmentWithInverseEList<SemesterInStudyplan>(SemesterInStudyplan.class, this, EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN, EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN);
		}
		return semestersInStudyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemestersInStudyplan()).basicAdd(otherEnd, msgs);
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
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				return ((InternalEList<?>)getSemestersInStudyplan()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__STUDENT_NAME:
				return getStudentName();
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				return getSemestersInStudyplan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__STUDENT_NAME:
				setStudentName((String)newValue);
				return;
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				getSemestersInStudyplan().clear();
				getSemestersInStudyplan().addAll((Collection<? extends SemesterInStudyplan>)newValue);
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
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__STUDENT_NAME:
				setStudentName(STUDENT_NAME_EDEFAULT);
				return;
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				getSemestersInStudyplan().clear();
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
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__STUDENT_NAME:
				return STUDENT_NAME_EDEFAULT == null ? studentName != null : !STUDENT_NAME_EDEFAULT.equals(studentName);
			case EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN:
				return semestersInStudyplan != null && !semestersInStudyplan.isEmpty();
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
		result.append(" (studentName: ");
		result.append(studentName);
		result.append(')');
		return result.toString();
	}

} //IndividualStudyPlanImpl
