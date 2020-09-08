/**
 */
package ecore.util;

import ecore.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ecore.EcorePackage
 * @generated
 */
public class EcoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcoreValidator INSTANCE = new EcoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ecore";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EcorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EcorePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case EcorePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case EcorePackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case EcorePackage.COURSE_IN_SEMESTER:
				return validatecourseInSemester((courseInSemester)value, diagnostics, context);
			case EcorePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case EcorePackage.INDIVIDUAL_STUDY_PLAN:
				return validateIndividualStudyPlan((IndividualStudyPlan)value, diagnostics, context);
			case EcorePackage.SEMESTER_IN_STUDYPLAN:
				return validateSemesterInStudyplan((SemesterInStudyplan)value, diagnostics, context);
			case EcorePackage.ELECTIVE:
				return validateElective((Elective)value, diagnostics, context);
			case EcorePackage.EXAM_ATTEMPT:
				return validateExamAttempt((ExamAttempt)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null) result &= validateProgramme_NotTooManyMandatoryPoints(programme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NotTooManyMandatoryPoints constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateProgramme_NotTooManyMandatoryPoints(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for (Semester semester : programme.getSemesterInProgramme()) {
			float sum = 0.0f;
			for (courseInSemester coInSe : semester.getCourseInSemester()) {
				sum+= coInSe.getCourse().getCredits();
			}
			if (sum > 30.0f) {
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "NotTooManyMandatoryPoints", getObjectLabel(programme, context) },
							 new Object[] { programme },
							 context));
				}
				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseInSemester(courseInSemester courseInSemester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInSemester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualStudyPlan(IndividualStudyPlan individualStudyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individualStudyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterInStudyplan(SemesterInStudyplan semesterInStudyplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semesterInStudyplan, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInStudyplan_containAllMandatoryCourses(semesterInStudyplan, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterInStudyplan_hasAllNeccesaryPoints(semesterInStudyplan, diagnostics, context);
		return result;
	}

	/**
	 * Validates the containAllMandatoryCourses constraint of '<em>Semester In Studyplan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesterInStudyplan_containAllMandatoryCourses(SemesterInStudyplan semesterInStudyplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean containsAll = true;
		List<Course> choosen = new ArrayList<Course>();
		List<Course> mandatory = new ArrayList<Course>();
		for (Elective e :semesterInStudyplan.getElectives()) {
			choosen.add(e.getCourse());
		}
		for (courseInSemester c : semesterInStudyplan.getSemester().getCourseInSemester()) {
			if(c.isMandatory()) {
				mandatory.add(c.getCourse());
			}
		}
		for (Course c : mandatory) {
			if (! choosen.contains(c)) {
				containsAll = false;
				break;
			}
		}
		if (!containsAll) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "containAllMandatoryCourses", getObjectLabel(semesterInStudyplan, context) },
						 new Object[] { semesterInStudyplan },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasAllNeccesaryPoints constraint of '<em>Semester In Studyplan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesterInStudyplan_hasAllNeccesaryPoints(SemesterInStudyplan semesterInStudyplan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float sum = 0.0f;
		for (Elective e : semesterInStudyplan.getElectives()) {
			sum += e.getCourse().getCredits();
		}
		if (sum> 30.0f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasAllNeccesaryPoints", getObjectLabel(semesterInStudyplan, context) },
						 new Object[] { semesterInStudyplan },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElective(Elective elective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elective, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elective, diagnostics, context);
		if (result || diagnostics != null) result &= validateElective_courseInStudyPlan(elective, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseInStudyPlan constraint of '<em>Elective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateElective_courseInStudyPlan(Elective elective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean inPlan = false;
		List<Course> i = new ArrayList<Course>();
		
		for (courseInSemester c : elective.getSemesterInStudyplan().getSemester().getCourseInSemester()) {
			i.add(c.getCourse());
		}
		if (i.contains(elective.getCourse())) {
			inPlan = true;
		}
		if (!inPlan) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseInStudyPlan", getObjectLabel(elective, context) },
						 new Object[] { elective },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExamAttempt(ExamAttempt examAttempt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(examAttempt, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcoreValidator
