/**
 */
package ecore.impl;

import ecore.EcorePackage;
import ecore.Elective;
import ecore.IndividualStudyPlan;
import ecore.Semester;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester In Studyplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.SemesterInStudyplanImpl#getStudyplan <em>Studyplan</em>}</li>
 *   <li>{@link ecore.impl.SemesterInStudyplanImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link ecore.impl.SemesterInStudyplanImpl#getElectives <em>Electives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterInStudyplanImpl extends MinimalEObjectImpl.Container implements SemesterInStudyplan {
	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester;

	/**
	 * The cached value of the '{@link #getElectives() <em>Electives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Elective> electives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterInStudyplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.SEMESTER_IN_STUDYPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualStudyPlan getStudyplan() {
		if (eContainerFeatureID() != EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN) return null;
		return (IndividualStudyPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyplan(IndividualStudyPlan newStudyplan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyplan, EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyplan(IndividualStudyPlan newStudyplan) {
		if (newStudyplan != eInternalContainer() || (eContainerFeatureID() != EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN && newStudyplan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyplan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyplan != null)
				msgs = ((InternalEObject)newStudyplan).eInverseAdd(this, EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN, IndividualStudyPlan.class, msgs);
			msgs = basicSetStudyplan(newStudyplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN, newStudyplan, newStudyplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		if (semester != null && semester.eIsProxy()) {
			InternalEObject oldSemester = (InternalEObject)semester;
			semester = (Semester)eResolveProxy(oldSemester);
			if (semester != oldSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER, oldSemester, semester));
			}
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semester newSemester) {
		Semester oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Elective> getElectives() {
		if (electives == null) {
			electives = new EObjectContainmentWithInverseEList<Elective>(Elective.class, this, EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES, EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN);
		}
		return electives;
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyplan((IndividualStudyPlan)otherEnd, msgs);
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectives()).basicAdd(otherEnd, msgs);
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				return basicSetStudyplan(null, msgs);
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				return ((InternalEList<?>)getElectives()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				return eInternalContainer().eInverseRemove(this, EcorePackage.INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN, IndividualStudyPlan.class, msgs);
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				return getStudyplan();
			case EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER:
				if (resolve) return getSemester();
				return basicGetSemester();
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				return getElectives();
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				setStudyplan((IndividualStudyPlan)newValue);
				return;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				getElectives().clear();
				getElectives().addAll((Collection<? extends Elective>)newValue);
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				setStudyplan((IndividualStudyPlan)null);
				return;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER:
				setSemester((Semester)null);
				return;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				getElectives().clear();
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
			case EcorePackage.SEMESTER_IN_STUDYPLAN__STUDYPLAN:
				return getStudyplan() != null;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__SEMESTER:
				return semester != null;
			case EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES:
				return electives != null && !electives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemesterInStudyplanImpl
