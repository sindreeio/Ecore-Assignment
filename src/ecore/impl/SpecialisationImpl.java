/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.Programme;
import ecore.Specialisation;
import ecore.courseInSemester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.SpecialisationImpl#getSpecialisationInProgramme <em>Specialisation In Programme</em>}</li>
 *   <li>{@link ecore.impl.SpecialisationImpl#getCourseInSemester <em>Course In Semester</em>}</li>
 *   <li>{@link ecore.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
	/**
	 * The cached value of the '{@link #getSpecialisationInProgramme() <em>Specialisation In Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisationInProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme specialisationInProgramme;

	/**
	 * The cached value of the '{@link #getCourseInSemester() <em>Course In Semester</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseInSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<courseInSemester> courseInSemester;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getSpecialisationInProgramme() {
		if (specialisationInProgramme != null && specialisationInProgramme.eIsProxy()) {
			InternalEObject oldSpecialisationInProgramme = (InternalEObject)specialisationInProgramme;
			specialisationInProgramme = (Programme)eResolveProxy(oldSpecialisationInProgramme);
			if (specialisationInProgramme != oldSpecialisationInProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME, oldSpecialisationInProgramme, specialisationInProgramme));
			}
		}
		return specialisationInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetSpecialisationInProgramme() {
		return specialisationInProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisationInProgramme(Programme newSpecialisationInProgramme) {
		Programme oldSpecialisationInProgramme = specialisationInProgramme;
		specialisationInProgramme = newSpecialisationInProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME, oldSpecialisationInProgramme, specialisationInProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<courseInSemester> getCourseInSemester() {
		if (courseInSemester == null) {
			courseInSemester = new EObjectResolvingEList<courseInSemester>(courseInSemester.class, this, EcorePackage.SPECIALISATION__COURSE_IN_SEMESTER);
		}
		return courseInSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				if (resolve) return getSpecialisationInProgramme();
				return basicGetSpecialisationInProgramme();
			case EcorePackage.SPECIALISATION__COURSE_IN_SEMESTER:
				return getCourseInSemester();
			case EcorePackage.SPECIALISATION__NAME:
				return getName();
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				setSpecialisationInProgramme((Programme)newValue);
				return;
			case EcorePackage.SPECIALISATION__COURSE_IN_SEMESTER:
				getCourseInSemester().clear();
				getCourseInSemester().addAll((Collection<? extends courseInSemester>)newValue);
				return;
			case EcorePackage.SPECIALISATION__NAME:
				setName((String)newValue);
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				setSpecialisationInProgramme((Programme)null);
				return;
			case EcorePackage.SPECIALISATION__COURSE_IN_SEMESTER:
				getCourseInSemester().clear();
				return;
			case EcorePackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				return specialisationInProgramme != null;
			case EcorePackage.SPECIALISATION__COURSE_IN_SEMESTER:
				return courseInSemester != null && !courseInSemester.isEmpty();
			case EcorePackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
