/**
 */
package ecore.impl;

import ecore.Course;
import ecore.EcorePackage;
import ecore.Elective;
import ecore.ExamAttempt;
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
 * An implementation of the model object '<em><b>Elective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecore.impl.ElectiveImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link ecore.impl.ElectiveImpl#getSemesterInStudyplan <em>Semester In Studyplan</em>}</li>
 *   <li>{@link ecore.impl.ElectiveImpl#getExamAttempts <em>Exam Attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveImpl extends MinimalEObjectImpl.Container implements Elective {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The cached value of the '{@link #getExamAttempts() <em>Exam Attempts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamAttempts()
	 * @generated
	 * @ordered
	 */
	protected EList<ExamAttempt> examAttempts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.ELECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcorePackage.ELECTIVE__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ELECTIVE__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterInStudyplan getSemesterInStudyplan() {
		if (eContainerFeatureID() != EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN) return null;
		return (SemesterInStudyplan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesterInStudyplan(SemesterInStudyplan newSemesterInStudyplan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemesterInStudyplan, EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterInStudyplan(SemesterInStudyplan newSemesterInStudyplan) {
		if (newSemesterInStudyplan != eInternalContainer() || (eContainerFeatureID() != EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN && newSemesterInStudyplan != null)) {
			if (EcoreUtil.isAncestor(this, newSemesterInStudyplan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemesterInStudyplan != null)
				msgs = ((InternalEObject)newSemesterInStudyplan).eInverseAdd(this, EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES, SemesterInStudyplan.class, msgs);
			msgs = basicSetSemesterInStudyplan(newSemesterInStudyplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN, newSemesterInStudyplan, newSemesterInStudyplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExamAttempt> getExamAttempts() {
		if (examAttempts == null) {
			examAttempts = new EObjectContainmentWithInverseEList<ExamAttempt>(ExamAttempt.class, this, EcorePackage.ELECTIVE__EXAM_ATTEMPTS, EcorePackage.EXAM_ATTEMPT__ELECTIVE);
		}
		return examAttempts;
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
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemesterInStudyplan((SemesterInStudyplan)otherEnd, msgs);
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExamAttempts()).basicAdd(otherEnd, msgs);
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
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				return basicSetSemesterInStudyplan(null, msgs);
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				return ((InternalEList<?>)getExamAttempts()).basicRemove(otherEnd, msgs);
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
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				return eInternalContainer().eInverseRemove(this, EcorePackage.SEMESTER_IN_STUDYPLAN__ELECTIVES, SemesterInStudyplan.class, msgs);
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
			case EcorePackage.ELECTIVE__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				return getSemesterInStudyplan();
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				return getExamAttempts();
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
			case EcorePackage.ELECTIVE__COURSE:
				setCourse((Course)newValue);
				return;
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				setSemesterInStudyplan((SemesterInStudyplan)newValue);
				return;
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				getExamAttempts().clear();
				getExamAttempts().addAll((Collection<? extends ExamAttempt>)newValue);
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
			case EcorePackage.ELECTIVE__COURSE:
				setCourse((Course)null);
				return;
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				setSemesterInStudyplan((SemesterInStudyplan)null);
				return;
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				getExamAttempts().clear();
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
			case EcorePackage.ELECTIVE__COURSE:
				return course != null;
			case EcorePackage.ELECTIVE__SEMESTER_IN_STUDYPLAN:
				return getSemesterInStudyplan() != null;
			case EcorePackage.ELECTIVE__EXAM_ATTEMPTS:
				return examAttempts != null && !examAttempts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElectiveImpl
