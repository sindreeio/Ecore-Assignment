/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.Programme;
import ecore.Semester;
import ecore.Specialisation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.SpecialisationImpl#getSpecialisationInProgramme <em>Specialisation In Programme</em>}</li>
 *   <li>{@link ecore.impl.SpecialisationImpl#getSemesterInSpecialisation <em>Semester In Specialisation</em>}</li>
 *   <li>{@link ecore.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecore.impl.SpecialisationImpl#getLowerLevelSpecialisation <em>Lower Level Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
	/**
	 * The cached value of the '{@link #getSemesterInSpecialisation() <em>Semester In Specialisation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterInSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesterInSpecialisation;

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
	 * The cached value of the '{@link #getLowerLevelSpecialisation() <em>Lower Level Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLevelSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation lowerLevelSpecialisation;

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
		if (eContainerFeatureID() != EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME) return null;
		return (Programme)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisationInProgramme(Programme newSpecialisationInProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialisationInProgramme, EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialisationInProgramme(Programme newSpecialisationInProgramme) {
		if (newSpecialisationInProgramme != eInternalContainer() || (eContainerFeatureID() != EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME && newSpecialisationInProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialisationInProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialisationInProgramme != null)
				msgs = ((InternalEObject)newSpecialisationInProgramme).eInverseAdd(this, EcorePackage.PROGRAMME__SPECIALISATIONS, Programme.class, msgs);
			msgs = basicSetSpecialisationInProgramme(newSpecialisationInProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME, newSpecialisationInProgramme, newSpecialisationInProgramme));
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
	public Specialisation getLowerLevelSpecialisation() {
		if (lowerLevelSpecialisation != null && lowerLevelSpecialisation.eIsProxy()) {
			InternalEObject oldLowerLevelSpecialisation = (InternalEObject)lowerLevelSpecialisation;
			lowerLevelSpecialisation = (Specialisation)eResolveProxy(oldLowerLevelSpecialisation);
			if (lowerLevelSpecialisation != oldLowerLevelSpecialisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION, oldLowerLevelSpecialisation, lowerLevelSpecialisation));
			}
		}
		return lowerLevelSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation basicGetLowerLevelSpecialisation() {
		return lowerLevelSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerLevelSpecialisation(Specialisation newLowerLevelSpecialisation) {
		Specialisation oldLowerLevelSpecialisation = lowerLevelSpecialisation;
		lowerLevelSpecialisation = newLowerLevelSpecialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION, oldLowerLevelSpecialisation, lowerLevelSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesterInSpecialisation() {
		if (semesterInSpecialisation == null) {
			semesterInSpecialisation = new EObjectResolvingEList<Semester>(Semester.class, this, EcorePackage.SPECIALISATION__SEMESTER_IN_SPECIALISATION);
		}
		return semesterInSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialisationInProgramme((Programme)otherEnd, msgs);
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				return basicSetSpecialisationInProgramme(null, msgs);
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				return eInternalContainer().eInverseRemove(this, EcorePackage.PROGRAMME__SPECIALISATIONS, Programme.class, msgs);
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
			case EcorePackage.SPECIALISATION__SPECIALISATION_IN_PROGRAMME:
				return getSpecialisationInProgramme();
			case EcorePackage.SPECIALISATION__SEMESTER_IN_SPECIALISATION:
				return getSemesterInSpecialisation();
			case EcorePackage.SPECIALISATION__NAME:
				return getName();
			case EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION:
				if (resolve) return getLowerLevelSpecialisation();
				return basicGetLowerLevelSpecialisation();
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
			case EcorePackage.SPECIALISATION__SEMESTER_IN_SPECIALISATION:
				getSemesterInSpecialisation().clear();
				getSemesterInSpecialisation().addAll((Collection<? extends Semester>)newValue);
				return;
			case EcorePackage.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION:
				setLowerLevelSpecialisation((Specialisation)newValue);
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
			case EcorePackage.SPECIALISATION__SEMESTER_IN_SPECIALISATION:
				getSemesterInSpecialisation().clear();
				return;
			case EcorePackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION:
				setLowerLevelSpecialisation((Specialisation)null);
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
				return getSpecialisationInProgramme() != null;
			case EcorePackage.SPECIALISATION__SEMESTER_IN_SPECIALISATION:
				return semesterInSpecialisation != null && !semesterInSpecialisation.isEmpty();
			case EcorePackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EcorePackage.SPECIALISATION__LOWER_LEVEL_SPECIALISATION:
				return lowerLevelSpecialisation != null;
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
