/**
 */
package ecore.impl;

import ecore.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreFactoryImpl extends EFactoryImpl implements EcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreFactory init() {
		try {
			EcoreFactory theEcoreFactory = (EcoreFactory)EPackage.Registry.INSTANCE.getEFactory(EcorePackage.eNS_URI);
			if (theEcoreFactory != null) {
				return theEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcorePackage.COURSE: return createCourse();
			case EcorePackage.PROGRAMME: return createProgramme();
			case EcorePackage.SPECIALISATION: return createSpecialisation();
			case EcorePackage.COURSE_IN_SEMESTER: return createcourseInSemester();
			case EcorePackage.SEMESTER: return createSemester();
			case EcorePackage.INDIVIDUAL_STUDY_PLAN: return createIndividualStudyPlan();
			case EcorePackage.SEMESTER_IN_STUDYPLAN: return createSemesterInStudyplan();
			case EcorePackage.ELECTIVE: return createElective();
			case EcorePackage.EXAM_ATTEMPT: return createExamAttempt();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackage.GRADE:
				return createGradeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcorePackage.GRADE:
				return convertGradeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public courseInSemester createcourseInSemester() {
		courseInSemesterImpl courseInSemester = new courseInSemesterImpl();
		return courseInSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualStudyPlan createIndividualStudyPlan() {
		IndividualStudyPlanImpl individualStudyPlan = new IndividualStudyPlanImpl();
		return individualStudyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterInStudyplan createSemesterInStudyplan() {
		SemesterInStudyplanImpl semesterInStudyplan = new SemesterInStudyplanImpl();
		return semesterInStudyplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elective createElective() {
		ElectiveImpl elective = new ElectiveImpl();
		return elective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExamAttempt createExamAttempt() {
		ExamAttemptImpl examAttempt = new ExamAttemptImpl();
		return examAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createGradeFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcorePackage getEcorePackage() {
		return (EcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcorePackage getPackage() {
		return EcorePackage.eINSTANCE;
	}

} //EcoreFactoryImpl
